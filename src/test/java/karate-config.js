function fn() {

  var env = 'qa';//karate.env;
  var project = 'ParcelEvents';//karate.project;
  var config = {
  javaLib: {}
  }

  config = karate.callSingle('classpath:Projects/' + project + '/config/' + env + '.js', config);

  karate.configure('logPrettyRequest', true);
  karate.configure('logPrettyResponse', true);

  return config;

}