find . -name "*~" -print0 | xargs -0 rm -rf
find . -name "*.class" -print0 | xargs -0 rm -rf
git add .
git commit -m "auto pushed by gitfin"
git push -u origin master
