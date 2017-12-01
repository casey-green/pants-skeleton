import requests


# http://docs.python-requests.org/en/master/
def get_content(url):
    r = requests.get(url)
    return r.text
