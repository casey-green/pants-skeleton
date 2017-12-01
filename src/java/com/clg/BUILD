java_library(
    name='java-lib',
    sources=globs('*.java', 'lib/*.java')
)

jvm_binary(
    name='java-run',
    main='com.clg.JavaMain',
    dependencies=[
        ':java-lib'
    ]
)
