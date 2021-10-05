def filter1(function, iterable=None):
    if iterable == None:    # Comparison using '__eq__'
        return [item for item in iterable if item]
    else:
        return [item for item in iterable if function(item)]