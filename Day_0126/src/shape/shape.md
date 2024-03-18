# ==== 도형 프로그램 설계 ====
package name :  shape.vo

## 점 (MyPoint) : abstract
- x : int
- y : int
+ constructor
+ setter/getter
+ toString() : String (@override)
+ calcArea() : double (abstract) 

## 원 (MyCircle) extends MyPoint
- radius : double
+ toString() : String
+calcArea() : double

## 삼각형(MyTriangle) extends MyPoint
- width : double
- height : double
+ toString() : String
+calcArea() : double

## 사각형(MyRectangle) extends MyPoint
- width : double
- height : double
+ toString() : String
+calcArea() : double