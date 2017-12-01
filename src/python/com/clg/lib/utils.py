
def file_lines(f):
    """
    :param f: file to read
    :return: lines in a file.
    :rtype: list[string]
    """
    with open(f) as f:
        content = f.readlines()

    return [x.strip() for x in content]
