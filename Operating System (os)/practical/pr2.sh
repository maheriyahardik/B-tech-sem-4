echo "Enter subject-1 marks:"
read s1

echo "Enter subject-2 marks:"
read s2

echo "Enter subject-3 marks:"
read s3

total=$((s1 + s2 + s3))
echo "Total marks: $total"

per=$((total / 3))
echo "Percentage: $per %"

if [ $per -gt 70 ]
then
  echo "Distinction Class"  -

elif [ $per -ge 61 -a $per -le 70 ]
then
  echo "First Class"

elif [ $per -ge 51 -a $per -le 60 ]
then
  echo "Second Class"

elif [ $per -ge 41 -a $per -le 50 ]
then
  echo "Third Class"

else
  echo "Fail"
fi
