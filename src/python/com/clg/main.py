import argparse

if __name__ == "__main__":
    # https://docs.python.org/3.3/library/argparse.html
    parser = argparse.ArgumentParser(description='Do some web stuff...')
    parser.add_argument("--http", action='store_true', help="Start HTTP server", required=False)
    parser.add_argument("--port", metavar="PORT", type=int, default=8888, help="Port to start HTTP server on")
    parser.add_argument("--url", metavar="URL", type=str, help="Fetch an URL", required=False)
    args = parser.parse_args()

    # import sys
    # args = sys.argv[1:]
    if args.http:
        import http
        http.app.run("0.0.0.0", args.port, debug=True)
    elif args.url:
        from http import fetcher
        print fetcher.get_content(args.url)
    else:
        print "Hello, world!"
