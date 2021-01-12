def call(Map params = [:]) {

  def tfpath  = params.get('tfpath', '')

  dir('scripts') {
    git credentialsId: "git", branch: "master", url: 'git@github.com:JGuzman4/scripts.git'
  }

  sh "./scripts/sh/terragruntApply.sh ${tfpath}"
}
