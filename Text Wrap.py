import textwrap

string = input()
max_width = int(input())

if 0<len(string)<1000 and 0<max_width<len(string):
    def wrap(string, max_width):
        print(textwrap.fill(string, max_width))
    wrap(string, max_width)
