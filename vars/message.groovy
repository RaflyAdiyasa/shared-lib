 def call(String target) {
    return "Calling ${target}"
 }

 def pwd() {
    sh("pwd")
 }

 def list(List words) {
    for (word in words) {
        sh("echo ${word}")
    }
 }

 def want(Map object) {
    echo("${object.name} want to ${object.action}")
 }