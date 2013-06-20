bridging-the-gap-between-haskell-and-java.pdf: bridging-the-gap-between-haskell-and-java.tex
	pdflatex $^
	pdflatex $^
	pdflatex $^
	pdflatex $^

bridging-the-gap-between-haskell-and-java.tex:
	simplex bridging-the-gap-between-haskell-and-java.simplex -Ttex
	pdflatex bridging-the-gap-between-haskell-and-java.simplex

