def call(Map params = [:]) {
  def templatePath = params.get('template_path', '.')
  git branch: "master", url: 'git@github.com:JGuzman4/scripts.git'
  sh "./scripts/sh/packerBuild.sh ${templatePath}"
}
