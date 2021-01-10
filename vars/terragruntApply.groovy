def call(Map params = [:]) {

  def tfpath  = params.get('tfpath', '')
  def tfstate = params.get('tfstate', '')

  dir('scripts') {
    git credentialsId: "git", branch: "master", url: 'git@github.com:JGuzman4/scripts.git'
  }

  sh "./scripts/sh/terragruntApply.sh ${tfpath} ${tfstate}"
}
