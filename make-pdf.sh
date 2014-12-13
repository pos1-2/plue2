#!/bin/bash
pandoc -f markdown_github -o PANDOC.tex README.md
pdflatex README.tex
