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