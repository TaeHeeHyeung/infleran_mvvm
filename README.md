디자인 패턴
no pattern, mvc, mvp, mvvm

- no pattern: activity와 xml만을 사용하여 코드 생성
  꼬여있는 스파게티코드로 유지보수 어려움

- mvc
  model: dataClass
  view: xml,
  controller: activity
  -> 컨트롤러에 입력이 추가될시 뷰와 모델 여러 부분에 영향을 미치게 된다.

- mvp
  model: dataCalss
  view: activity 
  presenter: 기능 interface, view interface 
  -> presenter와 view가 1:1 대응되어 테스트에 용이하다. 
view를 통해 입력을 받고 뷰는 preseter와 1:1 대응된다.
하지만 기능이 많아질 경우 코드가 너무 방대해진다.

- mvvm
  model: dataClass
  view: activity, xml
  viewmodel: viewModel
  -> viewModel 에서 LiveData를 가지고 있어 LiveData가 변경될 경우 
view에서는 Observer를 통해 변경사항에 따른 뷰의 변경만 처리해주면 된다.

