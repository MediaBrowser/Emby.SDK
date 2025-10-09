Pod::Spec.new do |s|
  s.name = 'EmbyClient'
  s.ios.deployment_target = '9.0'
  s.osx.deployment_target = '10.11'
  s.tvos.deployment_target = '9.0'
  s.version = '4.9.2.2'
  s.source = { :git => 'git@github.com:swagger-api/swagger-mustache.git', :tag => 'v1.0.0' }
  s.license = NoLicense
  s.homepage = 'https://emby.media'
  s.summary = 'The official Swift client library for Emby Server REST API access'
  s.description = 'The official Swift client library for Emby Server REST API access'
  s.documentation_url = 'https://dev.emby.media'
  s.source_files = 'EmbyClient/Classes/**/*.swift'
  s.dependency 'Alamofire', '~> 4.9.0'
end
