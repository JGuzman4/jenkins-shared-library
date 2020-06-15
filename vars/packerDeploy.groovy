def call(Map params = [:]) {
  def artifacts = params.get('artifacts', '')
  dir('scripts') {
    git branch: "master", url: 'git@github.com:JGuzman4/scripts.git'
  }

  artifacts.each { artifact ->
    sh "./scripts/sh/packerDeploy.sh ${artifact}"
  }
}
