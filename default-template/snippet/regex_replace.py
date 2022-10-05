import re
from templateframework.metadata import Metadata


def regex_replace(value: str, pattern: str, repl: str, count: int =0, flags: int=0):
    return re.sub(pattern, repl, value, count, flags)

def run(metadata: Metadata = None):
    
    metadata.filters['regex_replace'] = regex_replace

    return metadata

