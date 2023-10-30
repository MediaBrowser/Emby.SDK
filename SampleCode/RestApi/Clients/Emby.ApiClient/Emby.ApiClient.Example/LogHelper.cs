namespace Emby.RestClient.SampleApp
{
    using System;
    using System.Runtime.InteropServices;
    using System.Windows.Forms;

    internal static class LogHelper
    {
        private const int WM_VSCROLL = 277;

        private const int SB_PAGEBOTTOM = 7;


        [DllImport("user32.dll", CharSet = CharSet.Auto)]
        private static extern IntPtr SendMessage(IntPtr hWnd, int wMsg, IntPtr wParam, IntPtr lParam);

        public static void AppendText(RichTextBox richTextBox, string text)
        {
            if (text.Length == 0)
            {
                return;
            }

            richTextBox.Select(richTextBox.TextLength + 1, 0);
            richTextBox.SelectedText = text;

            ScrollToBottom(richTextBox);
        }

        private static void ScrollToBottom(RichTextBox richTextBox)
        {
            SendMessage(richTextBox.Handle, WM_VSCROLL, (IntPtr)SB_PAGEBOTTOM, IntPtr.Zero);
            richTextBox.SelectionStart = richTextBox.Text.Length;
        }
    }
}
