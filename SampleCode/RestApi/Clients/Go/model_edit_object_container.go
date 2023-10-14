/*
 * Emby Server REST API (BETA)
 *
 * Explore the Emby Server API
 *
 */
package embyclient-rest-go

type EditObjectContainer struct {
	Object *interface{} `json:"Object,omitempty"`
	DefaultObject *interface{} `json:"DefaultObject,omitempty"`
	TypeName string `json:"TypeName,omitempty"`
	EditorRoot *EditorsEditorRoot `json:"EditorRoot,omitempty"`
}
