# 自然言語処理用の日本の法律データ

元のデータは、[e-gov](https://elaws.e-gov.go.jp/download/)からとっています。JAXBを用いて整形しています。

整形後のデータはdata.zipとdata2.zipです。txtファイルはサンプルです。src内に整形した際に書いたコードを置く予定です。



## 注意事項
### 完成度はかなり低いです
- データ落ち
元データでは9300近くの法令についてのファイルがありますが、ZIPには8x00しか含まれていません。整形途中の処理で、1000ほどのファイルを落としてしまいました（2021/03/22時点）
- 整形しきれていない
ところどころ変な改行等が含まれています。
