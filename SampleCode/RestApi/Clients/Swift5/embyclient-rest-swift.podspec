Pod::Spec.new do |s|
  s.name = 'embyclient-rest-swift'
  s.ios.deployment_target = '9.0'
  s.osx.deployment_target = '10.11'
  s.tvos.deployment_target = '9.0'
  s.version = '4.8.10.0'
  s.source = { :git => 'git@github.com:swagger-api/swagger-mustache.git', :tag => 'v1.0.0' }
  s.license = NoLicense
  s.homepage = 'https://emby.media'
  s.summary = 'A client library for accessing Emby Server via REST API'
  s.description = 'A client library for accessing Emby Server via REST API'
  s.documentation_url = 'https://dev.emby.media'
  s.source_files = 'embyclient-rest-swift/Classes/**/*.swift'
  s.dependency 'Alamofire', '~> 4.9.0'
end
