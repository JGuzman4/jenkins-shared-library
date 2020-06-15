def call(Map params = [:]) {

  def artifactList = params.get('artifacts', '')

  def artifacts = artifactList.join(' ')



  dir('scripts') {
    git branch: "master", url: 'git@github.com:JGuzman4/scripts.git'
  }
  sh "./scripts/sh/packerDeploy.sh ${artifacts}"
}
