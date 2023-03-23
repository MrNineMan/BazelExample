load("@rules_java//java:defs.bzl", "java_binary", "java_library")

java_library(
    name = "Greeter",
    srcs = ["src/main/java/com/bazel/example/greetings/Greeter.java"],
)

java_binary (
    name = "Salutations",
    main_class = "com.bazel.example.Salutations",
    srcs = ["src/main/java/com/bazel/example/Salutations.java"],  
    deps = ["@maven//:org_beryx_text_io",":Greeter"], 
)
