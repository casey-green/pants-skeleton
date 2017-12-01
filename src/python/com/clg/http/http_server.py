from flask import Flask

# http://flask.pocoo.org/
app = Flask(__name__)


@app.route("/")
def hello():
    return "Hello World!"
