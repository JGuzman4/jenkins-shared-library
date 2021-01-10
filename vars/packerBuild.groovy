def call(Map params = [:]) {
  def templatePath = params.get('template_path', '.')
  dir('scripts') {
    git credentialsId: "git", branch: "master", url: 'git@github.com:JGuzman4/scripts.git'
  }
  sh "./scripts/sh/packerBuild.sh ${templatePath}"
}
