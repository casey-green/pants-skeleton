jvm_binary(
    name='scala-run',
    main='com.clg.ScalaMain',
    dependencies=[
        'src/scala/com/clg:scala-lib'
    ]
)

jvm_binary(
    name='java-run',
    main='com.clg.JavaMain',
    dependencies=[
        'src/java/com/clg:java-lib'
    ]
)

python_binary(
    name='py-run',
    dependencies=[
        'src/python/com/clg:py-lib'
    ],
    source='src/python/com/clg/main.py',
)
