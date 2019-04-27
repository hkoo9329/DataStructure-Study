package week5_LinkdeList_SimpleExam.exam1;

import lombok.extern.slf4j.Slf4j;


@Slf4j
class ExamPoly {

    public static void main(String[] args) {

        String ployA = "4x^5+2x^3+10x^2+1x^0";
        String ployB = "3x^4-2x^3+2x^2-4x^1";
        List A = stringToList(ployA);
        A.print();
        List B = stringToList(ployB);
        B.print();
        List C = addPolyList(A, B);
        C.print();

    }

    public static List addPolyList(List A, List B) {
        List list = new List();
        Node nodeA = A.getHead();
        Node nodeB = B.getHead();
        while (nodeA != null || nodeB != null) {
            if (nodeA == null && nodeB != null) {
                list.appendTerm(nodeB.getCoef(), nodeB.getExpo());
                nodeB = nodeB.getLink();
            } else if (nodeA != null && nodeB == null) {
                list.appendTerm(nodeA.getCoef(), nodeA.getExpo());
                nodeA = nodeA.getLink();
            } else {
                if (nodeA.getExpo() > nodeB.getExpo()) {
                    list.appendTerm(nodeA.getCoef(), nodeA.getExpo());
                    nodeA = nodeA.getLink();
                } else if (nodeA.getExpo() < nodeB.getExpo()) {
                    list.appendTerm(nodeB.getCoef(), nodeB.getExpo());
                    nodeB = nodeB.getLink();
                } else {
                    list.appendTerm(nodeA.getCoef() + nodeB.getCoef(), nodeA.getExpo());
                    nodeA = nodeA.getLink();
                    nodeB = nodeB.getLink();
                }
            }
        }
        return list;
    }


    public static List stringToList(String ploy) {
        List list = new List();
        String coef = null, expo = null;
        StringBuilder sbTemp = new StringBuilder();
        for (int i = 0; i < ploy.length(); i++) {
            switch (ploy.charAt(i)) {
                case 'x':
                    coef = sbTemp.toString();
                    sbTemp.delete(0, sbTemp.length());
                    break;
                case '^':
                    break;
                case '+':
                    expo = sbTemp.toString();
                    sbTemp.delete(0, sbTemp.length());
                    list.appendTerm(Float.valueOf(coef), Integer.parseInt(expo));
                    expo = "";
                    coef = "";
                    break;
                case '-':
                    expo = sbTemp.toString();
                    sbTemp.delete(0, sbTemp.length());
                    list.appendTerm(Float.valueOf(coef), Integer.parseInt(expo));
                    coef = "";
                    expo = "";
                    sbTemp.append('-');
                    break;
                default:
                    sbTemp.append(ploy.charAt(i));
                    break;
            }
            if (i >= ploy.length() - 1) {
                expo = sbTemp.toString();
                list.appendTerm(Float.valueOf(coef), Integer.parseInt(expo));
                break;
            }
        }
        return list;
    }


}
