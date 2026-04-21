import os
import sys

def str2int(cstr):
    cstr = str(cstr).replace(' ','').replace('\n', '')
    if(cstr[0:2]=='0x' or cstr[0:2]=='0X'):
        return int(cstr,16)
    elif(cstr == ''):
        return None
    elif(cstr.find('.') != -1):
        return eval(cstr)
    elif(cstr.find('E') != -1):
        return eval(cstr)
    else:
        return int(cstr,10)


def project_path(local_path = ''):
    """Returns the base application path."""
    if hasattr(sys, 'frozen'):
        return os.path.dirname(sys.executable)

    return os.getcwd() + '/' + local_path


class switch(object):
    def __init__(self, value):
        self.value = value
        self.fall = False

    def __iter__(self):
        """Return the match method once, then stop"""
        yield self.match
        raise StopIteration

    def match(self, *args):
        """Indicate whether or not to enter a case suite"""
        if self.fall or not args:
            return True
        elif self.value in args:
            self.fall = True
            return True
        else:
            return False
