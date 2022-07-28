package main.devlee.designpatterns._03_behavioal_patterns.observer

/**
 * 옵저버를 등록, 제거, 알림 기능을 제공하는 인터페이스이다.
 * 옵저버 패턴은 구독을하고 해제하는 함수를 항상 만들어 두어야 하며,
 * 필요가 없는 시점에 해제하지 않으면 메모리릭이 발생하기 때문에 사용하지 않는다면,
 * 꼭 해제를 명시적으로 해제를 시켜주어야 한다.
 * notifyObservers() 함수를 통해 구독된 옵저버 모두에게 변경된 상태를 알려 준다.
 */
interface Subject {
    fun registerObserver(o: Observer)
    fun removeObserver(o: Observer)
    fun notifyObservers()
}