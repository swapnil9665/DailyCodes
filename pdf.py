import PyPDF2 as pdf
a=pdf.PdfReader('Resume.pdf')
print(a.read.pages[1])

