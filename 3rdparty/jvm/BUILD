jar_library(
    name='args4j',
    jars=[
        jar('args4j', 'args4j', '2.33')
    ])

jar_library(
    name='guava',
    jars=[
        jar('com.google.guava', 'guava', '18.0',
            apidocs='http://google.github.io/guava/releases/18.0/api/docs/')
    ])

jar_library(
    name='commons-lang',
    jars=[
        jar(org='commons-lang', name='commons-lang', rev='2.5'),
    ])

jar_library(
    name='log4j',
    jars=[
        jar(org='log4j', name='log4j', rev='1.2.15',
            excludes=[
                exclude(org='jline', name='jline'),
                exclude(org='javax.jms', name='jms'),
                exclude(org='com.sun.jdmk', name='jmxtools'),
                exclude(org='com.sun.jmx', name='jmxri'),
            ])
    ])

jar_library(
    name='slf4j-api',
    jars=[
        jar(org='org.slf4j', name='slf4j-api', rev='1.6.1'),
    ])

jar_library(
    name='gson',
    jars=[
        jar(org='com.google.code.gson', name='gson', rev='2.8.2'),
    ],
)

jar_library(
    name='colossus',
    jars=[
        jar(org='com.tumblr', name='colossus_2.12', rev='0.10.1'),
    ]
)

jar_library(
    name='http4s',
    jars=[
        jar(org='org.http4s', name='http4s-dsl_2.12', rev='0.17.5'),
        jar(org='org.http4s', name='http4s-blaze-server_2.12', rev='0.17.5'),
        jar(org='org.http4s', name='http4s-blaze-client_2.12', rev='0.17.5'),
    ]
)

jar_library(
    name='scalaj',
    jars=[
        jar(org='org.scalaj', name='scalaj-http_2.12', rev='2.3.0'),
    ]
)

# TEST

jar_library(
    name='mockito-core',
    jars=[
        jar(org='org.mockito', name='mockito-core', rev='2.7.21'),
    ],
)

jar_library(
    name='specs2-junit_2.12',
    jars=[
        jar(org='org.specs2', name='specs2-junit_2.12', rev='3.8.9'),
    ],
)

jar_library(
    name='easymock',
    jars=[
        jar('org.easymock', 'easymock', '3.4')
    ])

jar_library(
    name='junit',
    jars=[
        jar('junit', 'junit', '4.12')
    ],
    # junit is frequently used only for its annotations.
    scope='forced', )

jar_library(
    name='scalatest',
    jars=[
        scala_jar('org.scalatest', 'scalatest', '3.0.0')
    ])
