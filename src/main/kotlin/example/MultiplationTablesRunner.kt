

fun main(args: Array<String>) {
    /*
     * args 옵션을 정리해본다.
     * -Dp=cols값. 범위값은 1~9 사이값.
     */
    // TODO: 2022/03/03  실행옵션을 구현합니다.
    println("Arguments are ${if(args.isEmpty()) "empty." else args.joinToString()}")

    /*
     * 애플리케이션 launch message를 보여준다.
     * 이때 로딩중같은 표현을 위해서 coroutine을 적용해본다.
     */
    // TODO: 2022/03/03
    println("loading....")


    /*
     * 구현부분입니다. columns값에 따라 구현하는 로직
     * 이 부분에서 억지로 팩토리 패턴을 사용하도록 시도해본다.
     * 또한, 뭔가 로직이 수행되는 것처럼 딜레이를 줘본다.
     * 출력하는 output writer 를 console과 파일 두개로 만든다.
     */
    println("2 * 1 = 2")

    /*
     * 종료 메시지를 로딩 중 처럼 보여준다... 마치 진행되는 것처럼...
     */
    println("Exit, Goob-by MultiplationRunner!!")


}