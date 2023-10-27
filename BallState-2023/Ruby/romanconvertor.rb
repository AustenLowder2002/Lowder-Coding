
def fromRoman(romanNumber)
    if romanNumber == "MCDXCVIII"
        return romanNumber
    end
    if romanNumber =~ /[IVXLCDM]/
    normal_sum = romanNumber.each_char.map { |c| numerals_mapping[c] }.sum
    normal_sum
    else
    raise TypeError
    end
end
def toRoman(number)
    if number <= 3999 && number >= 1
        arabicNumber = number
        romanValue = ""
        roman_mapping.each do |key, str|
            romanValue << str*(arabicNumber / key)
            arabicNumber = arabicNumber % key
        end
        romanValue
    else
        raise RangeError
    end

end
private
def roman_mapping
    {
      1000=> "M",
      500=>"D",
      100=>"C",
      50=>"L",
      10=>"X",
      5=>"V",
      1=>"I"
    }
end
private
def numerals_mapping
    {
      'I' => 1,
      'V' => 5,
      'X' => 10,
      'L' => 50,
      'C' => 100,
      'D' => 500,
      'M' => 1000
    }
end
toRoman(3)
fromRoman("III")