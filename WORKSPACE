load("@bazel_tools//tools/build_defs/repo:http.bzl", "http_archive")

RULES_JVM_EXTERNAL_TAG = "5.1"
RULES_JVM_EXTERNAL_SHA ="8c3b207722e5f97f1c83311582a6c11df99226e65e2471086e296561e57cc954"


http_archive(
    name = "rules_jvm_external",
    strip_prefix = "rules_jvm_external-%s" % RULES_JVM_EXTERNAL_TAG,
    sha256 = RULES_JVM_EXTERNAL_SHA,
    url = "https://github.com/bazelbuild/rules_jvm_external/releases/download/%s/rules_jvm_external-%s.tar.gz" % (RULES_JVM_EXTERNAL_TAG, RULES_JVM_EXTERNAL_TAG)
)

http_archive(
    name = "bazel_skylib",
    sha256 = "b8a1527901774180afc798aeb28c4634bdccf19c4d98e7bdd1ce79d1fe9aaad7",
    urls = [
        "https://mirror.bazel.build/github.com/bazelbuild/bazel-skylib/releases/download/1.4.1/bazel-skylib-1.4.1.tar.gz",
        "https://github.com/bazelbuild/bazel-skylib/releases/download/1.4.1/bazel-skylib-1.4.1.tar.gz",
    ],
)

load("@rules_jvm_external//:defs.bzl", "maven_install")


maven_install(
    artifacts = [
        "org.beryx:text-io:3.4.1",
        
    ],

    repositories = [
        "https://maven.google.com",
        "https://repo1.maven.org/maven2",
        "https://jcenter.bintray.com/",
        "http://uk.maven.org/maven2",
    ],
)