scala_library(
    name='scala-lib',
    sources=globs('*.scala', 'lib/*.scala', 'http/*.scala'),
    dependencies=[
        '3rdparty/jvm:gson',
        '3rdparty/jvm:colossus',
        '3rdparty/jvm:http4s',
        '3rdparty/jvm:scalaj',
    ]
)

jvm_binary(
    name='scala-run',
    main='com.clg.ScalaMain',
    dependencies=[
        ':scala-lib'
    ]
)
