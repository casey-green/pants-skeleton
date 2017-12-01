# https://github.com/pantsbuild/pants/tree/master/examples/src/python/example
# https://www.pantsbuild.org/python-readme.html
python_library(
    name="py-lib",
    sources=rglobs("*.py"),
    dependencies=[
        '3rdparty/python:Flask',
        '3rdparty/python:requests',
    ]
)


python_binary(
    dependencies=[
        'src/python/com/clg:py-lib'
    ],
    source='main.py',
)
