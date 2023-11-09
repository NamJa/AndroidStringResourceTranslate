package data

class SrcStringData {
    companion object {
        val srcString = """

                <string name="app_name">미니창고 다락</string>

                <!--  Common Strings  -->
                <string name="confirm">확인</string>
                <string name="app_finish">앱을 종료하시겠습니까?</string>
                <string name="goto_permission_setting">설정으로 이동</string>
                <string name="cancel">취소</string>
                <string name="long_string_text">비밀번호 0987, 우체국 5호 박스 5~10개 정도 사서 픽업 신청하기, 비밀번호 0987, 우체국 5호 박스 5~10개, 비밀번호 0987, 우체국비밀번호 0987, 우체국 5호 박스 5~10개 정도 사서 픽업 신청하기</string>
                <string name="default_card_name">기본카드</string>
                <string name="location_permission_title">현재 위치를 받기 위해선 권한을 허용해야 합니다.</string>
                <string name="global_exception_message">오류가 발생하였습니다. 다시 시도해주세요.</string>

                <!--  Access Permission Fragment  -->
                <string name="acc_fragment_title">앱 접근 권한 안내</string>
                <string name="acc_fragment_sub_title">다락 서비스 이용을 위해 다음 권한의 허용이 필요합니다.</string>
                <string name="location_permission">위치정보(선택)</string>
                <string name="loc_permission_reason1">현재 위치 기준 가까운 지점 위치 제공 및 지점 출입 이용을 위해 필요합니다.</string>
                <string name="loc_permission_reason2">접근 권한에 동의하지 않아도 서비스를 이용할 수 있으나\n일부 기능 사용에 제한이 있을 수 있습니다.</string>
                <string name="remove_permission">선택적 접근권한 철회 방법</string>
                <string name="remove_permission_explain">설정 > 개인(신용)정보보호 > 해당 접근권한 > 접근 권한 철회</string>

                <!--  Location Confirm Dialog Fragment  -->
                <string name="location_confirm_title">위치를 확인 중입니다.</string>
                <string name="location_confirm_content">Wi-Fi 대신 모바일 네트워크를 사용해주세요.</string>

                <!--  Login Fragment  -->
                <string name="login_fragment_title">로그인</string>
                <string name="login_fragment_id_email">아이디(이메일)</string>
                <string name="login_fragment_id_email_edittext_hint">이메일을 입력해주세요</string>
                <string name="login_fragment_password">비밀번호</string>
                <string name="login_fragment_password_edittext_hint">비밀번호를 입력해주세요</string>
                <string name="login_fragment_find_user_id">아이디 찾기</string>
                <string name="login_fragment_find_user_pw">비밀번호 찾기</string>
                <string name="login_fragment_contact_us">문의하기</string>
                <string name="login_fragment_look_around"><u>둘러보기</u></string>
                <string name="login_fragment_already_our_user_toast">이미 %1$'s로 가입한 정보가 있습니다.</string>

                <!--  Find User IDPW Container Fragment  -->
                <string name="find_user_fragment_title">아이디 / 비밀번호 찾기</string>
                <string name="find_user_fragment_tab_id">아이디 찾기</string>
                <string name="find_user_fragment_tab_pw">비밀번호 찾기</string>

                <!--  Find User IDPW Fragment  -->
                <string name="find_user_fragment_self_auth_btn">본인인증</string>
                <string name="find_user_fragment_info_text">본인인증을 통해 아이디(이메일) 확인 및 비밀번호를 변경하실 수 있습니다.</string>
                <string name="find_user_fragment_id_explain">본인인증을 통해 아이디(이메일)\n확인이 가능합니다.</string>
                <string name="find_user_fragment_pw_explain">본인인증을 통해\n비밀번호 변경이 가능합니다.</string>
                <string name="find_user_fragment_not_found_id">존재하지 않는 이메일 계정입니다.</string>
                <string name="find_user_fragment_not_found_user">일치하는 회원정보를 찾을 수 없습니다.\nSNS로 가입하신 경우 SNS계정으로 로그인을 진행해주세요.</string>
                <string name="find_user_fragment_business_member_alert">법인 회원은 고객센터로 문의하여 주시기 바랍니다.</string>

                <!--   User ID Confirm Fragment  -->
                <string name="user_id_confirm_fragment_title">아이디 확인</string>
                <string name="user_id_confirm_fragment_search_completed_title">아이디 찾기 완료</string>
                <string name="user_id_confirm_fragment_search_completed">회원님의 아이디는 다음과 같습니다.</string>
                <string name="user_id_confirm_fragment_below_button_click">아래 로그인 버튼을 눌러 로그인해주세요.</string>
                <string name="user_id_confirm_fragment_btn_text">로그인 하기</string>

                <!--  Password Regenerate Fragment  -->
                <string name="password_regenerate_title">비밀번호 재설정</string>
                <string name="password_regenerate_new_password">새 비밀번호</string>
                <string name="password_regenerate_retype_password">비밀번호 재입력</string>
                <string name="password_regenerate_new_password_hint">6~20자(숫자,영문,특수문자 중 2개 이상 조합)</string>
                <string name="password_regenerate_retype_password_hint">새 비밀번호를 재입력하세요</string>
                <string name="password_regenerate_error_1">숫자, 영문, 특수문자 중 2개 이상 조합으로 6~20자리를\n사용해야합니다.</string>
                <string name="password_regenerate_not_matched_password">비밀번호가 일치하지 않습니다.</string>
                <string name="password_regenerate_change_pw_btn">비밀번호 변경</string>

                <!--  Need Login Fragment  -->
                <string name="need_login_reason">로그인 후 사용이 가능합니다.</string>
                <string name="go_to_login">로그인 하러 가기</string>

                <!--  Main Fragment  -->
                <string name="bottom_tab_search_branch">지점 찾기</string>
                <string name="bottom_tab_smartpass">다락 이용</string>
                <string name="bottom_tab_mypage">마이페이지</string>
                <string name="bottom_tab_more">더보기</string>


                <!--  dialog popup notice  -->
                <string name="dialog_popup_notice_not_see_one_day">오늘 하루 보지 않기</string>
                <string name="dialog_popup_notice_close">닫기</string>


                <!--  Smart Pass Fragment  -->
                <string name="smart_pass_fragment_title">다락 이용</string>
                <string name="smart_pass_fragment_not_present_for_smartpass">스마트 패스를\n제공하지 않는 지점입니다.</string>
                <string name="smart_pass_fragment_adt_caps_message">출입문 쪽 지문인식기에\n등록된 지문을 인식하세요.</string>
                <string name="smart_pass_fragment_expand">펼치기</string>
                <string name="smart_pass_fragment_fold">접기</string>
                <string name="smart_pass_fragment_use_start">이용시간 |&#160;</string>
                <string name="smart_pass_fragment_tour_password">비밀번호 : &#160;</string>
                <string name="smart_pass_fragment_tilde">&#160;&#160;~</string>
                <string name="smart_pass_fragment_remain_time_qr">남은시간</string>
                <string name="smart_pass_fragment_remain_time_card">모바일 카드로 안열리면?</string>
                <string name="smart_pass_fragment_open_gate">문열기</string>
                <string name="smart_pass_fragment_open_doorlock">도어락 열기</string>
                <string name="smart_pass_fragment_using_date">신청 하신 이용 시작일&lt;br>&lt;b>%1$'s&lt;/b>부터 사용가능 합니다.</string>
                <string name="smart_pass_fragment_using_tour">투어 이용 시간에 사용 가능합니다.</string>
                <string name="smart_pass_fragment_goto_s1app">에스원 모바일카드 앱을 실행 후\n카드리더기에 인식시켜주세요.</string>
                <string name="smart_pass_fragment_s1_nfc_usage">다락 모바일 카드를 활성화하여\n출입 리더기에 인식하면 출입문이 열립니다.</string>
                <string name="smart_pass_fragment_goto_s1gate_usage">에스원 보안 출입방법</string>
                <string name="smart_pass_fragment_qrcode_usage">출입문 쪽 리더기에\nQR코드를 인식하세요</string>
                <string name="smart_pass_fragment_s1_market_link">https://play.google.com/store/apps/details?id=kr.co.s1.mobilecard.s1mobilecard</string>
                <string name="smart_pass_fragment_s1_usage_link">https://www.notion.so/2ndsyndrome/b9d41d93fbd0417d9212619ca77704f3</string>
                <string name="smart_pass_fragment_branch_usage">지점 이용가이드</string>
                <string name="smart_pass_fragment_branch_map">지점맵</string>
                <string name="smart_pass_fragment_branch_parking_system">주차장 출입</string>
                <string name="smart_pass_fragment_enable_sone_card">모바일카드 활성화하기</string>
                <string name="smart_pass_fragment_s1_refresh_cardnumber">새로고침</string>
                <string name="smart_pass_fragment_parking_gate_suyu_title">주차차단기가 다 올라간 것을 확인 후\n진입, 퇴장해 주세요</string>
                <string name="smart_pass_fragment_parking_gate_suyu_content">주차장차단기는 자동으로 닫힙니다.</string>
                <string name="smart_pass_fragment_parking_gate_yeoksam_title">주차장 셔터가 다 올라간 것을 확인 후\n진입, 퇴장해 주세요</string>
                <string name="smart_pass_fragment_parking_gate_yeoksam_content">주차장 셔터는 자동으로 닫힙니다.</string>
                <string name="smart_pass_fragment_expired_tour_msg">투어한 다락이 마음에 드셨나요?</string>
                <string name="smart_pass_fragment_emergency_open_page_explain_1">다락은 서비스 개선을 위해 해당 설문을 문열기 이용 시 항상 묻고 있습니다.</string>
                <string name="smart_pass_fragment_emergency_open_page_explain_2">운영사항에 따라 출입문 별 이용 가능 시간이 다를 수 있습니다.</string>
                <string name="smart_pass_fragment_survey_1">NFC가 기본모드로 설정되어있나요?</string>
                <string name="smart_pass_fragment_survey_2">휴대폰 케이스, 교통카드 등 방해가 될 만한 요소를 제거하고 시도하셨나요?</string>
                <string name="smart_pass_fragment_survey_3">지금 계신 곳의 출입문을 선택해주세요</string>
                <string name="smart_pass_fragment_radio_btn_yes">네</string>
                <string name="smart_pass_fragment_radio_btn_no">아니오</string>
                <string name="smart_pass_fragment_tour_badge">투어</string>
                <string name="smart_pass_fragment_tour_using_start_time">이용시간</string>
                <string name="smart_pass_fragment_tour_branch_contract">투어 지점 계약하기</string>
                <string name="smart_pass_fragment_gate_info_error">Gate 정보가 없습니다.</string>
                <string name="smart_pass_fragment_not_support_nfc">NFC 미지원기기 입니다.</string>
                <string name="smart_pass_fragment_not_closable_branch_location_error_title">지점 출입을 할 수 없는 위치입니다.</string>
                <string name="smart_pass_fragment_not_closable_branch_location_error_content">지점 문열기는 지점 앞에서 가능합니다.</string>
                <string name="smart_pass_fragment_gate_list_empty_error">지점 게이트 목록이 비었습니다.</string>
                <string name="smart_pass_fragment_gate_list_error">해당 지점의 게이트 목록을 가져오는데 실패하였습니다.</string>
                <string name="smart_pass_fragment_another_gate_open">다른 문 열기</string>
                <string name="smart_pass_fragment_not_available_location_service">위치서비스를 사용할 수 없습니다.</string>
                <string name="smart_pass_fragment_request_location_service">위치 사용 권한을 허용해주세요.</string>
                <string name="smart_pass_fragment_request_fine_location_service">정확한 위치 사용을 권장합니다.</string>
                <string name="smart_pass_fragment_is_opened_parking_gate_title">현재 주차장 셔터가 열려있는 시간입니다.</string>
                <string name="smart_pass_fragment_is_opened_parking_gate_content">이미 주차장 셔터가 열려있습니다.</string>
                <string name="smart_pass_fragment_error_title">오류가 발생했습니다.</string>
                <string name="smart_pass_fragment_error_content">다시 시도해주세요.</string>
                <string name="smart_pass_fragment_not_closable_parking_gate_location_error_title">주차장 출입을 할 수 없는 위치입니다.</string>
                <string name="smart_pass_fragment_not_closable_parking_gate_location_error_content">지점이 위치한 건물 앞에서 주차장 출입을 \n할 수 있습니다.</string>
                <string name="smart_pass_fragment_get_mobile_card">모바일카드 활성화</string>
                <string name="smart_pass_fragment_open_branch_gate">지점 문열기</string>
                <string name="smart_pass_fragment_dalock_family_manage">다락패밀리 관리</string>
                <string name="smart_pass_fragment_dalock_memo_hint">보관중인 물건을 메모해보세요</string>
                <string name="smart_pass_fragment_doorlock_memo">도어락 메모</string>
                <string name="smart_pass_fragment_unit_func_modal_store_memo">내 보관메모</string>
                <string name="smart_pass_fragment_unit_func_modal_using_history">이용 내역</string>
                <string name="smart_pass_fragment_manage_dalock_family">다락패밀리 관리</string>
                <string name="smart_pass_fragment_is_not_opened">문이 안 열리시나요?</string>
                <string name="smart_pass_fragment_mobile_card_mode">모바일 카드 모드</string>
                <string name="smart_pass_fragment_button_open_gate_mode">버튼 열기 모드</string>



                <!--  Emergency Enter Open Gate  -->
                <string name="emergency_enter_open_popup_title_s1">만약 출입에 문제가 생긴다면\n에스원(1588&#8211;3112)로 연락해주세요.</string>
                <string name="emergency_enter_open_popup_title_caps">만약 출입에 문제가 생긴다면\n캡스(1588&#8211;6400)로 연락해주세요.</string>
                <string name="emergency_enter_open_popup_title_ktt">만약 출입에 문제가 생긴다면\nKT텔레캅(1588&#8211;0112)로 연락해주세요.</string>
                <string name="emergency_enter_open_popup_content_s1">에스원에서 주소를 요청한다면\n다락 지점명과 상세주소를 말씀해주세요.</string>
                <string name="emergency_enter_open_popup_content_caps">캡스에서 주소를 요청한다면\n다락 지점명과 상세주소를 말씀해주세요.</string>
                <string name="emergency_enter_open_popup_content_ktt">KT텔레캅에서 주소를 요청한다면\n다락 지점명과 상세주소를 말씀해주세요.</string>


                <!--  Open Doorlock Dialog Fragment  -->
                <string name="open_doorlock_dialog_title">도어락 메모</string>
                <string name="open_doorlock_dialog_normal_doorlock">유닛 관리</string>
                <string name="open_doorlock_dialog_are_you_open_doorlock">지점에 입장하셨나요?</string>
                <string name="open_doorlock_dialog_no_btn">아니오</string>
                <string name="open_doorlock_dialog_yes_btn">열기</string>
                <string name="open_doorlock_dialog_opening_to_doorlock_kt">도어락을 열고 있습니다.\n사용 후에는 문을 꼭 닫아주세요</string>
                <string name="open_doorlock_dialog_opening_to_doorlock_normal">사용 후에는 문을 꼭 닫아주세요</string>
                <string name="open_doorlock_dialog_not_open_doorlock_kt">도어락이 열리지 않는 경우 저장된 핀코드를 사용하여 도어락을 열어주세요.</string>
                <string name="open_doorlock_dialog_not_open_doorlock_normal">비밀번호를 사용하여 도어락을 열어주세요.</string>
                <string name="open_doorlock_dialog_view_pin_code">비밀번호 보기</string>
                <string name="open_doorlock_dialog_opened">도어락이 열렸습니다!</string>
                <string name="open_doorlock_dialog_pincode">핀코드</string>

                <!--  Doorlock Memo Dialog Fragment  -->
                <string name="doorlock_memo_dialog_title">도어락 메모</string>
                <string name="doorlock_memo_explain_1">비밀번호는 도어락에서 직접 변경하고\n아래에 메모 해두고 사용하세요.</string>
                <string name="doorlock_memo_explain_2">(비밀번호는 다락패밀리와 공유됩니다.)</string>
                <string name="doorlock_memo_explain_3">도어락 비밀번호 변경방법</string>
                <string name="doorlock_memo_explain_4">도어락 사용시 비밀번호를 5회이상 틀리면\n일정시간 사용이 불가하니 유의하세요.</string>
                <string name="doorlock_memo_doorlock_pw_hint">비밀번호 메모</string>
                <string name="doorlock_memo_save_btn">저장</string>
                <string name="doorlock_memo_dialog_error_msg">비밀번호는 4~6자리 이어야 합니다</string>
                <string name="doorlock_memo_dialog_change_password_guide_1">도어락을 개방하여 배터리 커버를 열고 안쪽에 있는 버튼을 눌러주세요</string>
                <string name="doorlock_memo_dialog_change_password_guide_2">바깥에서 원하시는 비밀번호 4~6자리를 누르신 뒤 ‘*‘ 또는 등록 버튼을 눌러주세요.</string>

                <!--  Open Kerong Dialog Fragment  -->
                <string name="open_kerong_dialog_title">지점에 입장하셨나요?</string>
                <string name="open_kerong_dialog_content_1">도어락 열기를 하면, 유닛 문이 열립니다.\n지점에 입장하셔서 도어락 열기를 해주세요!</string>
                <string name="open_kerong_dialog_not_open_btn">아니오. 지점에 가서 열게요.</string>
                <string name="open_kerong_dialog_open_btn">예. 도어락을 열겠습니다.</string>
                <string name="open_kerong_dialog_content_2">열린 도어락은 사용후 직접 닫아주어야 합니다!\n도어를 끝까지 꼭 닫아주세요!</string>
                <string name="open_kerong_dialog_content_3">도어락을 열까요?</string>
                <string name="open_kerong_dialog_no_button">아니오</string>
                <string name="open_kerong_dialog_yes_button">열기</string>
                <string name="open_kerong_dialog_is_open">도어락이 열렸습니다</string>
                <string name="open_kerong_dialog_error">에러가 발생하였습니다. 다시 시도해주세요</string>


                <!--  Dalock Store Memo  -->
                <string name="dalock_store_memo_title">내 보관메모</string>
                <string name="dalock_store_memo_hint">메모하고 싶은 내용을 입력하세요</string>


                <!--  not available doorlock popup  -->
                <string name="not_available_doorlock_popup">유닛 이용시간이 아닙니다.\n확인 후 다시 이용해주세요.</string>
                <!--  not available tour gate popup  -->
                <string name="not_available_tour_gate_popup">투어 이용시간이 아닙니다.\n확인 후 다시 이용해주세요.</string>
                <!--  not available gate popup  -->
                <string name="not_available_gate_500_else">연결에 실패하였습니다.\n다시 연결을 시도해주세요.</string>

                <!--  Example Smartpass Fragment  -->
                <string name="example_smartpass_branch_name">세컨신드롬지점</string>
                <string name="example_smartpass_info">계약한 다락을 이용하려면\n로그인하세요.</string>
                <string name="example_smartpass_goto_login">로그인하기</string>
                <string name="example_smartpass_contract">계약</string>
                <string name="example_smartpass_unit">C13</string>

                <!--  My Page Fragment  -->
                <string name="my_page_fragment_title">마이페이지</string>
                <string name="my_page_welcome">안녕하세요</string>
                <string name="my_page_nim">님</string>
                <string name="my_page_info_title">내 정보</string>
                <string name="my_page_profile_account">프로필 및 계정</string>
                <string name="my_page_using_info">다락 이용 정보</string>
                <string name="my_page_pickup_service">픽업 서비스</string>
                <string name="my_page_payment_history">결제 내역</string>
                <string name="my_page_preorder_history">사전 예약</string>
                <string name="my_page_use_manage_title">이용 관리</string>
                <string name="my_page_policy_title">서비스 약관</string>
                <string name="my_page_dalock_service_policy">다락 서비스 이용약관</string>
                <string name="my_page_electronic_financial_transaction">전자금융거래 이용약관</string>
                <string name="my_page_user_info_policy">개인정보 처리방침</string>
                <string name="my_page_location_permission_policy">위치기반 서비스 이용약관</string>
                <string name="my_page_logout_dialog_message">정말 로그아웃할까요?</string>
                <string name="my_page_logout_btn">로그아웃</string>
                <string name="service_policy_url">https://policy.dalock.kr/dalock</string>
                <string name="electronic_financial_transaction_policy_url">https://policy.dalock.kr/banking</string>
                <string name="user_info_policy_url">https://policy.dalock.kr/private</string>
                <string name="location_permission_policy_url">https://policy.dalock.kr/location</string>
                <string name="marketing_policy_url">https://policy.dalock.kr/marketing</string>

                <!--  Client Member Info Fragment  -->
                <string name="client_member_fragment_user_name">이름</string>
                <string name="client_member_fragment_email">아이디(이메일)</string>
                <string name="client_member_fragment_change_name_korean_char_error">자음/모음만 입력할 수 없습니다.</string>
                <string name="client_member_fragment_phone_number">휴대폰 번호</string>
                <string name="client_member_fragment_address">주소</string>
                <string name="client_member_fragment_birthday">생년월일</string>
                <string name="client_member_fragment_change_address">주소를 변경해주세요.</string>
                <string name="client_member_fragment_password">비밀번호</string>
                <string name="client_member_fragment_change_phone_number">번호 변경</string>
                <string name="client_member_fragment_regen_password">재설정</string>
                <string name="client_member_fragment_withdraw">회원탈퇴</string>
                <string name="client_member_fragment_change_user_info_success">사용자 정보 변경이 완료되었습니다.</string>

                <!--  Business Member Info Fragment  -->
                <string name="business_member_fragment_email">아이디(이메일)</string>
                <string name="business_member_fragment_company_name">법인명</string>
                <string name="business_member_fragment_company_number">사업자 번호</string>
                <string name="business_member_fragment_company_phone_number">법인 전화번호</string>
                <string name="business_member_fragment_tax">세금계산서 발급</string>
                <string name="business_member_fragment_address">주소</string>
                <string name="business_member_fragment_manager_name">담당자명</string>
                <string name="business_member_fragment_manager_phone_num">담당자 전화번호</string>
                <string name="business_member_fragment_password">비밀번호</string>
                <string name="business_member_fragment_change_manager">담당자 정보 변경</string>
                <string name="business_member_fragment_regen_password">재설정</string>
                <string name="business_member_fragment_withdraw">회원탈퇴</string>
                <string name="business_member_fragment_modify_manager_success">담당자 정보가 변경되었습니다.</string>

                <string name="member_address_change">주소 변경</string>

                <!--  User Info Fragment  -->
                <string name="user_info_toolbar_title">프로필 및 계정</string>

                <!--  View More Fragment (더보기)  -->
                <string name="view_more_fragment_title">더보기</string>
                <string name="view_more_setting_title">설정</string>
                <string name="view_more_noti_settings">알림 설정</string>
                <string name="view_more_location_service">위치 서비스</string>
                <string name="view_more_on_loc">켜짐</string>
                <string name="view_more_off_loc">꺼짐</string>
                <string name="view_more_customer_servie_title">고객지원</string>
                <string name="view_more_app_version">앱버전</string>
                <string name="view_more_notice">공지사항</string>
                <string name="view_more_contact_us">문의하기</string>
                <string name="view_more_opensource_notice">오픈소스 라이브러리</string>
                <string name="view_more_dalock_news">다락 소식</string>
                <string name="view_more_homepage_url">https://www.dalock.kr/</string>
                <string name="view_more_naver_blog_url">https://blog.naver.com/da-lock</string>
                <string name="view_more_instagram_url">https://www.instagram.com/dalock.kr/</string>
                <string name="view_more_youtube_url">https://www.youtube.com/channel/UCb8jgOXyMXvmnO7nyLSFl8w</string>
                <string name="view_more_dalock_market_url">http://market.dalock.kr/</string>
                <string name="view_more_notice_url">https://www.dalock.kr/notice?webview=true&amp;isApp=true</string>

                <!--  Notification Setting Fragment  -->
                <string name="noti_setting_title">알림 설정</string>
                <string name="noti_setting_sub_title">혜택 및 마케팅 정보 수신 동의</string>
                <string name="noti_setting_sms">문자</string>
                <string name="noti_setting_email">이메일</string>
                <string name="noti_setting_toast_sms_accept">문자 알림 수신에\n동의하셨습니다.(%1$'s)</string>
                <string name="noti_setting_toast_sms_denied">문자 알림 수신에\n거부하셨습니다.(%1$'s)</string>
                <string name="noti_setting_toast_email_accept">이메일 알림 수신에\n동의하셨습니다.(%1$'s)</string>
                <string name="noti_setting_toast_email_denied">이메일 알림 수신에\n거부하셨습니다.(%1$'s)</string>

                <!--  Login Dialog Fragment  -->
                <string name="login_dialog_title">사용자 위치 사용 권한을 켜거나 끌 수 있습니다.</string>
                <string name="login_dialog_message">다락은 가까운 다락 지점을 찾기 위해 위치 권한을 필요로 합니다.</string>
                <string name="login_dialog_positive">확인</string>
                <string name="login_dialog_negative">취소</string>

                <!--  Contact Us Fragment  -->
                <string name="contact_title">문의하기</string>
                <string name="contact_introduce">단체, 법인, 특수목적 등 별도 문의가 필요한 경우는 \n 고객센터로 연락해주세요.</string>
                <string name="contact_to_kakao">카카오로 문의하기</string>
                <string name="contact_to_phone">전화로 문의하기</string>
                <string name="contact_working_time">월~토 10:00 &#8211; 18:00, 점심시간 12:00 &#8211; 13:00</string>
                <string name="contact_to_kakao_url">http://pf.kakao.com/_xbxfDEu/chat</string>
                <string name="contact_to_phone_num">tel:1661&#8211;0180</string>

                <!--  Branch Using Info Fragment -->
                <string name="branch_using_info_toolbar_title">다락 이용 정보</string>


                <!--  Not Using Branch Fragment  -->
                <string name="not_using_branch_title">아직 이용중인 지점이 없습니다.</string>
                <string name="not_using_branch_btn_text">다락 지점 알아보러 가기</string>

                <!--  Preorder Status Fragment  -->
                <string name="preorder_status_title">사전예약</string>
                <string name="preorder_status_open_day">오픈예정일</string>
                <string name="preorder_status_unit_kind">유닛 종류</string>
                <string name="preorder_status_preorder_fee">사전예약금</string>
                <string name="preorder_status_not_preordered_message">현재 사전예약 중인 지점정보가 없습니다.</string>
                <string name="preorder_status_goto_branch_map">사전예약 지점 보러가기</string>

                <!--  On Login Password Regen Fragment  -->
                <string name="on_login_password_regen_now_pw">현재 비밀번호</string>
                <string name="on_login_password_regen_now_pw_edittext_hint">현재 비밀번호를 입력하세요</string>
                <string name="on_login_password_regen_not_matched_now_pw">올바른 비밀번호가 아닙니다.</string>
                <string name="on_login_password_regen_success_message">비밀번호 변경이 완료되었습니다.</string>

                <!--  recyclerview item branch unit info  -->
                <string name="recycler_item_branch_unit_guarantee">보증금</string>
                <string name="recycler_item_branch_unit_monthly_fee">월 이용료</string>
                <string name="recycler_item_branch_unit_startday">시작일</string>
                <string name="recycler_item_branch_unit_next_charge_day">다음 결제일</string>
                <string name="recycler_item_branch_unit_doorlock_pincode_setting">도어락 핀코드 설정</string>


                <!--  Sign UP - XX - Fragment  -->
                <string name="signup_fragment_title">회원가입</string>
                <string name="signup_fragment_put_info">정보를 입력해주세요.</string>
                <string name="signup_fragment_address">주소</string>
                <string name="signup_fragment_postnum">우편번호</string>
                <string name="signup_fragment_search_postnum">우편번호 검색</string>
                <string name="signup_fragment_detail_address_edittext">상세주소를 입력해주세요</string>
                <string name="signup_fragment_birthday">생년월일</string>
                <string name="signup_fragment_birthday_date_picker">생년월일을 선택해주세요</string>
                <string name="signup_fragment_error_message">입력한 정보를 확인해주세요.</string>
                <string name="signup_fragment_confirm_error_message">본인인증여부 또는 입력한 정보를 확인해주세요.</string>
                <string name="signup_fragment_policy_accpet_title">약관 동의</string>
                <string name="signup_fragment_all_accept">전체 동의합니다.</string>
                <string name="signup_fragment_over_14">만 14세 이상입니다.</string>
                <string name="signup_fragment_location_policy">[선택] 위치기반서비스 이용약관</string>
                <string name="signup_fragment_marketing_policy">[선택] 혜택 및 마케팅 정보 수신 동의</string>16px
                <string name="signup_fragment_sms">SMS</string>
                <string name="signup_fragment_email">이메일</string>


                <!--  Email User SelfAuth Fragment  -->
                <string name="email_user_self_auth_reason1">서비스 이용을 위해서\n본인인증이 필요합니다.</string>
                <string name="email_user_self_auth_reason2">본인 인증은 최초 1회만 진행하며, 이후에는 별도의 인증절차없이 서비스 이용 및 계약이 가능합니다. 인증하신 정보는 회원정보에 반영됩니다.</string>
                <string name="email_user_self_auth_button">본인인증</string>
                <string name="email_user_self_auth_error">본인인증을 완료해주세요</string>
                <string name="email_user_self_update_auth">회원정보 업데이트</string>
                <string name="email_user_self_name">이름</string>
                <string name="email_user_self_phone">휴대폰 번호</string>
                <string name="email_user_self_name_hint">이름을 입력해주세요</string>
                <string name="email_user_self_phone_hint">휴대폰 번호</string>

                <!--  Withdrawal Dialog Fragment  -->
                <string name="withdrawal_dialog_title">회원 탈퇴</string>
                <string name="withdrawal_dialog_info1">회원 탈퇴 시 회원정보, 거래정보 및 프로모션 코드는 모두 삭제되며 삭제된 정보는 복구되지 않습니다.</string>
                <string name="withdrawal_dialog_info2">단, 법령에 따라 일부 정보는 일정 기간 보관 후 파기됩니다.</string>
                <string name="withdrawal_dialog_info3">다락 서비스를 이용중인 회원</string>
                <string name="withdrawal_dialog_info4">탈퇴 시 동일한 SNS계정, 이메일, 전화번호를 사용한 재가입은 <b>3개월</b> 이내 제한됩니다.</string>
                <string name="withdrawal_dialog_info5">이용완료후 미납 금액이 남아있는 회원</string>
                <string name="withdrawal_dialog_info5_full_text">자세한 사항은 개인정보처리방침을 확인해주세요.</string>
                <string name="withdrawal_dialog_info6">탈퇴문의 : 다락 고객센터 1661–0180</string>
                <string name="withdrawal_dialog_checkbox">위 내용을 모두 확인하였습니다.</string>
                <string name="withdrawal_dialog_resignup_ban">재가입 제한</string>
                <string name="withdrawal_dialog_privacy">개인정보 보관</string>
                <string name="withdrawal_dialog_unorderlist">•</string>
                <string name="withdrawal_dialog_not_enabled_withdrawal">탈퇴 불가능 회원</string>
                <string name="withdrawal_dialog_button">확인</string>
                <string name="withdrawal_dialog_cannot_be_withdrawal">이용 중인 서비스를 모두 종료 후 다시 시도해주세요.</string>
                <string name="withdrawal_dialog_confirm_withdrawal">탈퇴 처리가 완료되었습니다</string>

                <!--  Signup Welcome fragment  -->
                <string name="signup_welcome_fragment_welcome_title">회원가입을 축하드립니다</string>
                <string name="signup_welcome_fragment_welcome_user">님</string>
                <string name="signup_welcome_fragment_welcome_text">첫 달 50% 할인 혜택을 누려보세요!</string>


                <!--  Branch Map Fragment  -->
                <string name="branch_map_fragment_searchView_queryHint">다락 지점명이나 지역으로 검색해보세요</string>
                <string name="branch_map_fragment_notice_branch_number">개의 다락 지점이 있습니다.</string>
                <string name="branch_map_fragment_radio_btn_1">&#160;가까운 거리순</string>
                <string name="branch_map_fragment_radio_btn_2">&#160;낮은 가격순</string>
                <string name="branch_map_fragment_no_search_res">검색 결과가 없습니다.</string>

                <!--  map_marker.xml  -->
                <string name="map_marker_xml_from_minimum">최저</string>
                <string name="map_marker_xml_presales_tag">pre</string>

                <!--  Recyclerview item branch list XML  -->
                <string name="recyclerview_item_branch_list_tag_preorder">사전예약</string>
                <string name="recyclerview_item_branch_list_tag_discount">특가할인</string>
                <string name="recyclerview_item_branch_list_tag_free_pickup">무료픽업</string>
                <string name="recyclerview_item_branch_list_tag_discount_pickup">픽업할인</string>
                <string name="recyclerview_item_branch_list_from_low_price">최저</string>

                <!--  Branch Info Detail WebView Fragment  -->
                <string name="branch_info_detail_webview_fragment_header_title">지점 상세</string>
                <string name="branch_info_detail_webview_fragment_tour_btn">방문 투어</string>
                <string name="branch_info_detail_webview_fragment_contract_btn">다락 이용하기</string>
                <string name="branch_info_detail_webview_fragment_preorder">사전예약하기</string>

                <!--  Branch Preorder Fragment  -->
                <string name="branch_preorder_fragment_header_title">사전예약하기</string>
                <string name="branch_preorder_fragment_unit_kind">유닛 유형</string>
                <string name="branch_preorder_fragment_no_sellable_unit">남은 유닛이 없습니다.</string>
                <string name="branch_preorder_fragment_using_fee">이용 요금</string>
                <string name="branch_preorder_fragment_from_fee">부터</string>
                <string name="branch_preorder_fragment_using_notice">실제 이용 유닛에 따라 금액에 차이가 있습니다.</string>
                <string name="branch_preorder_fragment_preorder_fee">사전예약금</string>
                <string name="branch_preorder_fragment_confirm_notice">사전예약 유의사항을 꼭 확인해주세요</string>
                <string name="branch_preorder_fragment_preorder_btn">사전예약금 선결제</string>
                <string name="branch_preorder_unit_remain">사전예약 가능한 유닛이 %1$'d개 남았습니다.</string>


                <!--  Branch Tour Fragment  -->
                <string name="branch_tour_fragment_header_title">지점 방문 투어</string>
                <string name="branch_tour_fragment_visit_day">방문 예정일</string>
                <string name="branch_tour_fragment_visit_time">방문 예정시간</string>
                <string name="branch_tour_fragment_select_hint">선택해주세요</string>
                <string name="branch_tour_fragment_select_tour_day_hint">투어 희망일을 선택해주세요.</string>
                <string name="branch_tour_fragment_select_tour_time_hint">방문 예정시간을 선택해주세요.</string>
                <string name="branch_tour_fragment_visit_day_select_error_msg">방문 예정일을 먼저 선택하세요</string>
                <string name="branch_tour_fragment_tour_available_notice">투어 가능 유닛 안내</string>
                <string name="branch_tour_fragment_notice_1">잔여 유닛이 없을 경우 투어가 불가한 점 양해 부탁 드립니다.\n특정 유닛을 확인하고 싶으시다면 타지점을 이용해 보세요.</string>
                <string name="branch_tour_fragment_tour_btn">방문 투어하기</string>
                <string name="branch_tour_fragment_introductory_remark_1">선택</string>
                <string name="branch_tour_fragment_introductory_remark_2">불가</string>
                <string name="branch_tour_fragment_notice_2">• 투어 시간은 지정시간으로부터 60분간 가능합니다.</string>
                <string name="branch_tour_fragment_unit_info_error">투어 가능한 유닛 정보를 불러오지 못했습니다.</string>
                <string name="branch_tour_fragment_time_info_error">투어 가능한 시간대 정보를 불러오지 못했습니다.</string>
                <string name="branch_tour_fragment_am">오전</string>
                <string name="branch_tour_fragment_pm">오후</string>


                <!--  Unit Size -->
                <string name="unit_size_cube">큐브</string>
                <string name="unit_size_slim">슬림</string>
                <string name="unit_size_small">스몰</string>
                <string name="unit_size_small_plus">스몰+</string>
                <string name="unit_size_medium">미디움</string>
                <string name="unit_size_medium_plus">미디움+</string>
                <string name="unit_size_large">라지</string>
                <string name="unit_size_large_plus">라지+</string>


                <!--  Tour Request Result Fragment  -->
                <string name="tour_request_result_tour_req_complete">방문 투어 신청이 완료되었습니다.</string>
                <string name="tour_request_result_notice_1">신청 내역은 마이페이지에서 확인 가능합니다.</string>
                <string name="tour_request_result_visit_branch">방문 지점</string>
                <string name="tour_request_result_visit_day">방문 예정일</string>
                <string name="tour_request_result_visit_time">방문 예정 시간</string>
                <string name="tour_request_result_branch_using_guide">지점 이용가이드 확인</string>
                <string name="tour_request_result_confirm_btn">확인</string>
                <string name="tour_request_result_tour_req_fail">신청이 완료되지 않았습니다.</string>
                <string name="tour_request_result_notice_2">투어 예약을 다시 시도해주세요.</string>
                <string name="tour_request_result_contact_cs">계속해서 오류가 발생할 경우 고객센터로 연락주세요.\n고객센터 1661-0180</string>


                <!--  Branch Unit Contract Info Fragment  -->
                <string name="branch_unit_contract_info_header_title">다락 이용하기</string>
                <string name="branch_unit_contract_info_unit_kind">유닛 유형</string>
                <string name="branch_unit_contract_info_notice_1">사전 예약 고객 유의사항</string>
                <string name="branch_unit_contract_info_barely_sellable_notice">선택한 유닛이 얼마 남지 않았어요!</string>
                <string name="branch_unit_contract_info_unit">유닛 번호 선택</string>
                <string name="branch_unit_contract_info_select_unit">사용하실 유닛 번호를 선택해 주세요.</string>
                <string name="branch_unit_contract_info_no_sellable_unit">남은 유닛이 없습니다.</string>
                <string name="branch_unit_contract_info_using_day">이용 시작일</string>
                <string name="branch_unit_contract_info_select_using_day">이용 시작일을 선택해주세요.</string>
                <string name="branch_unit_contract_info_using_fee">이용 요금</string>
                <string name="branch_unit_contract_info_from_final_price">부터</string>
                <string name="branch_unit_contract_info_notice_2">실제 이용 유닛에 따라 금액에 차이가 있습니다.</string>
                <string name="branch_unit_contract_info_presales_customer_notice">사전 예약 고객은 예약시 선택한 유닛 타입을 선택해주세요.\n다른 유닛 선택시 사전 예약금 및 할인율이 적용되지 않습니다.</string>
                <string name="branch_unit_contract_info_not_available_branch">이용 가능한 유닛이 없습니다.\n다른 지점 이용 부탁드립니다.</string>
                <string name="branch_unit_contract_info_not_available_branch_new_unit">이용 가능한 유닛이 없습니다.\n깍두기 유닛 및 다른 지점 이용 부탁드립니다.</string>
                <string name="branch_unit_contract_info_contract_btn">다락 이용하기</string>
                <string name="branch_unit_contract_info_new_unity">독특한 유닛, 더욱 저렴한 금액</string>
                <string name="branch_unit_contract_info_new_unity_title">깍두기 유닛</string>
                <string name="branch_unit_contract_info_new_unity_shortcut">[바로가기]</string>
                <string name="branch_unit_contract_info_dalock_family_1">다락패밀리 최대 4인 이용시</string>
                <string name="branch_unit_contract_info_dalock_family_2">부터</string>
                <string name="branch_unit_contract_info_dalock_family_tip1">[다락앱]-[다락 이용]-[다락패밀리 관리]에서 이용할 수 있습니다.</string>
                <string name="branch_unit_contract_info_dalock_family_tip2">이용의 책임과 권한은 대표자에게 있습니다.</string>

                <!--  Branch Unit Payment Fragment  -->
                <string name="branch_unit_payment_fragment_dalock">다락</string>
                <string name="branch_unit_payment_fragment_use">이용하기</string>
                <string name="branch_unit_payment_fragment_header_title">결제하기</string>
                <string name="branch_unit_payment_fragment_contractor">계약자</string>
                <string name="branch_unit_payment_fragment_contractor_name">이름</string>
                <string name="branch_unit_payment_fragment_contractor_contact">연락처</string>
                <string name="branch_unit_payment_fragment_contractor_id">아이디(이메일)</string>
                <string name="branch_unit_payment_fragment_contractor_address">주소</string>
                <string name="branch_unit_payment_fragment_contract_info">계약 정보</string>
                <string name="branch_unit_payment_fragment_contract_info_branch">지점</string>
                <string name="branch_unit_payment_fragment_contract_info_size">사이즈</string>
                <string name="branch_unit_payment_fragment_contract_info_use_start_day">이용 시작일</string>
                <string name="branch_unit_payment_fragment_contract_info_">계약 정보</string>
                <string name="branch_unit_payment_fragment_promotion_code_title">프로모션</string>
                <string name="branch_unit_payment_fragment_promotion_code_section">프로모션 코드</string>
                <string name="branch_unit_payment_fragment_promotion_code_input_hint">프로모션 코드를 입력해주세요</string>
                <string name="branch_unit_payment_fragment_promotion_notice">기본 할인율이 프로모션 코드 할인율 보다 높을 경우, 기본 할인율이 적용됩니다.</string>
                <string name="branch_unit_payment_fragment_contact_deposit">보증금</string>
                <string name="branch_unit_payment_fragment_using_pay">이용 요금</string>
                <string name="branch_unit_payment_fragment_using_pay_monthly">ㄴ 월 이용요금</string>
                <string name="branch_unit_payment_fragment_preorder_tooltip">사전 예약 시 고객님이 결제한 선금입니다.</string>
                <string name="branch_unit_payment_fragment_total_payment">총 결제금액</string>
                <string name="branch_unit_payment_fragment_pay_notice">보증금, 이용요금은 각각 결제 됩니다.</string>
                <string name="branch_unit_payment_fragment_regular_payment">정기 결제 예정</string>
                <string name="branch_unit_payment_fragment_next_pay_expect_day">다음 결제 예정일</string>
                <string name="branch_unit_payment_fragment_expect_fee">결제 예정 금액</string>
                <string name="branch_unit_payment_fragment_precaution_title">유의사항</string>
                <string name="branch_unit_payment_fragment_precuation_agreement">모든 유의사항을 확인하고 동의합니다.</string>
                <string name="branch_unit_payment_fragment_payment_info">결제 정보</string>
                <string name="branch_unit_payment_fragment_guarantee_guide">보증금은 최초 1회 결제되며, <b>서비스 종료 시 100% 환급</b>해 드립니다.\n다만, 시설물의 훼손, 약정 계약의 중도 해지, 미납, 연체 등의 경우 일부 혹은 전체가 환불되지 않을 수 있습니다.</string>
                <string name="branch_unit_payment_fragment_terms_link1">https://policy.dalock.kr/dalock#%EC%A0%9C-28%EC%A1%B0-%EC%86%90%ED%95%B4%EB%B0%B0%EC%83%81-%EB%B0%8F-%EB%B3%B4%EA%B4%80%EB%AC%BC-%EB%B3%B4%ED%97%98</string>
                <string name="branch_unit_payment_fragment_terms_link2">https://policy.dalock.kr/dalock#%EC%A0%9C-19%EC%A1%B0-%EB%B3%B4%EA%B4%80-%EA%B8%88%EC%A7%80-%EB%AC%BC%ED%92%88</string>
                <string name="branch_unit_payment_fragment_notice_3_1">고객센터 운영시간 이후 계약 시, 당일 출입이 불가능합니다.</string>
                <string name="branch_unit_payment_fragment_notice_3_2">첫 방문 시에는 다락 고객센터 운영 시간 내에 출입 안내를 받으신 후 출입이 가능합니다.</string>
                <string name="branch_unit_payment_fragment_goto_branch_using_guide">지점 이용 가이드 보러가기 ></string>
                <string name="branch_unit_payment_fragment_terms_1">(필수) 사고 발생 시 보상 확인</string>
                <string name="branch_unit_payment_fragment_detail">보기</string>
                <string name="popup_contract_terms_fragment_notice">※ 유의사항을 확인하지 않아 생기는 불이익에 대해서 당사는 책임지지 않습니다.\n※ 이 외에 기재되지 않은 사항에 대해서는 내부 약관에 의거하여 처리됩니다.</string>
                <string name="branch_unit_payment_fragment_notice_4">보관된 물품 금액의 전체 합은 보증금의 10배를 넘지 않는 것으로 간주하며, 해당 금액을 초과하는 물품의 모든 책임은 이용자에게 귀속됩니다.</string>
                <string name="branch_unit_payment_fragment_notice_5">보관 금지 항목에 포함되는 물품이 보관되어 있는 경우, 이용자는 회사에게 손해배상 청구를 할 수 없습니다.</string>
                <string name="branch_unit_payment_fragment_notice_6">손해배상 및 보관물 보험 자세히보기 ></string>
                <string name="branch_unit_payment_fragment_notice_7">보관 금지 물품 자세히보기 ></string>
                <string name="branch_unit_payment_fragment_notice_8">(필수) 계약 및 결제 유의사항 확인</string>
                <string name="branch_unit_payment_fragment_accident_notice">사고 발생 시 보상 확인</string>
                <string name="branch_unit_payment_fragment_contract_precaution_notice">계약 및 결제 유의사항 확인</string>


                <!--  Pay Success Fragment  -->
                <string name="pay_success_header_title">다락 이용 신청이 완료되었습니다.</string>
                <string name="pay_success_using_branch">이용 지점</string>
                <string name="pay_success_unit_kind">유닛 종류</string>
                <string name="pay_success_using_start_day">이용 시작일</string>
                <string name="pay_success_unit_number">유닛 번호</string>
                <string name="pay_success_notice_1">이용하실 유닛을 확인해주세요.</string>
                <string name="pay_success_first_visit_notice">첫 방문 안내</string>
                <string name="pay_success_enter_notice">출입 안내</string>
                <string name="pay_success_doorlock_notice">도어락 이용 안내</string>
                <string name="pay_success_notice_2">더 자세한 내용이 궁금하다면?</string>
                <string name="pay_success_branch_using_guide">지점 이용가이드 확인</string>
                <string name="pay_success_confirm_btn">확인</string>
                <string name="pay_success_first_visit_explain_caps">계약 후 지점 첫 방문 시, 출입을 위한 지문을 등록해 드립니다.\n아래 고객센터 운영 시간 내에 방문 해주시기를 바랍니다.</string>
                <string name="pay_success_first_visit_explain_iot">지점 첫 방문 시 지점 이용에 어려움이 있을 수 있으니, 고객센터 운영 시간 내 방문하시면 더욱 편리하게 이용할 수 있습니다.</string>
                <string name="pay_success_customer_service_center_worktime">(월~토 10:00~18:00 점심시간: 12:00~13:00)</string>
                <string name="pay_success_gate_using_guide_caps">1. 출입 리더기에 등록된 지문을 인식하면 문이 열립니다.\n\n2. 퇴실시에는 출입 리더기의 [경비/해제] 버튼을 누르고 지문 인식을 해주세요.\n※ 문은 지문인식 후 3초 후에 다시 잠깁니다.</string>
                <string name="pay_success_gate_using_guide_s1_caps">이용 시작일부터 사용할 수 있는 다락 모바일 카드가 발급됩니다.\n\n1. 지점 앞에서 [다락 앱]을 실행하여 [다락 이용]에서 다락 모바일 카드를 활성화해주세요.\n\n2. 출입 리더기에 모바일 카드를 인식하면 출입문이 열립니다.\n※  화면이 켜져 있을 때만 인식됩니다.</string>
                <string name="pay_success_gate_using_guide_kt">이용 시작일부터 사용할 수 있는 QR코드가 발급됩니다.\n\n1. 지점 앞에서 QR코드를 활성화해주세요.\n    - 홈페이지 : [마이페이지] - [이용내역] - [출입 QR코드 받기] \n    - 앱 : [다락 이용] - [출입 QR코드]\n\n2. 출입 리더기에서 QR코드를 인식하면 출입문이 열립니다.\n\n3. 퇴실 시에는 출입 리더기의 [경비] 버튼을 누른 후 인식해주세요.\n    ※ QR코드로 퇴장이 불가능하다면 지점 내부의 푸시 버튼으로 퇴장해주세요.</string>
                <string name="pay_success_doorlock_using_guide_normal">카카오 알림톡으로 도어락 이용 안내가 발송됩니다.\n자세한 사용 방법은 카카오 알림톡을 참고하여 주세요.</string>
                <string name="pay_success_doorlock_using_guide_iot">- 홈페이지 : [마이페이지] - [이용내역] - [도어락 열기]\n- 앱 : [다락 이용] - [도어락 열기]\n\n※ 열린 도어락은 사용 후 직접 닫아주어야 하니 지점에 입장하셔서 도어락 열기를 해주세요.</string>


                <!--  Pay Fail Fragment  -->
                <string name="pay_fail_1">결제가 실패</string>
                <string name="pay_fail_2">되었습니다.</string>


                <!--  Preorder Confirm Payment Fragment  -->
                <string name="preorder_confirm_payment_header_title_1">사전예약금</string>
                <string name="preorder_confirm_payment_header_title_2">선결제</string>
                <string name="preorder_confirm_payment_pre_user">예약자</string>
                <string name="preorder_confirm_payment_pre_user_name">이름</string>
                <string name="preorder_confirm_payment_pre_user_contact">연락처</string>
                <string name="preorder_confirm_payment_pre_user_email">아이디(이메일)</string>
                <string name="preorder_confirm_payment_pre_user_address">주소</string>
                <string name="preorder_confirm_payment_preorder_contact_info">계약 정보</string>
                <string name="preorder_confirm_payment_branch">지점</string>
                <string name="preorder_confirm_payment_unit_size">사이즈</string>
                <string name="preorder_confirm_payment_expect_open_date">오픈 예정일</string>
                <string name="preorder_confirm_payment_notice_1">지점 오픈 일은 사정에 따라 변경될 수 있습니다.</string>
                <string name="preorder_confirm_payment_preorder_fee">사전예약금</string>
                <string name="preorder_confirm_payment_currency_won">&#160;원</string>
                <string name="preorder_confirm_payment_precaution_title">유의사항</string>
                <string name="preorder_confirm_payment_precaution_agreement">모든 유의사항을 확인하고 동의합니다.</string>
                <string name="preorder_confirm_payment_notice">[사전 예약 시 유의사항]</string>
                <string name="preorder_confirm_payment_preorder_pay_btn">50,000원 결제하기</string>

                <!--  Preorder Result Fragment  -->
                <string name="preorder_result_title_1">사전예약이 완료</string>
                <string name="preorder_result_title_2">되었습니다.</string>
                <string name="preorder_result_using_branch">이용 지점</string>
                <string name="preorder_result_unit_kind">유닛 종류</string>
                <string name="preorder_result_using_start_day">이용 시작일</string>
                <string name="preorder_result_preorder_notice">사전예약 안내</string>
                <string name="preorder_result_preorder_cancel_notice">취소 및 환불 안내</string>
                <string name="preorder_result_contact_cs">다락 문의하기</string>
                <string name="preorder_result_confirm_btn">확인</string>
                <string name="preorder_result_notice_1">지점 오픈일이 변동될 수 있습니다. 변경 시 별도 안내드리겠습니다.</string>
                <string name="preorder_result_notice_2">계약 링크는 지점 오픈일 10:00에 카카오톡으로 발송됩니다.</string>
                <string name="preorder_result_notice_3">원하는 위치의 유닛은 지점 오픈 후 3일 이내 선택 가능합니다. 이후 선착순 배정됩니다.</string>
                <string name="preorder_result_notice_4">계약 링크 유효기간은 7일입니다.</string>
                <string name="preorder_result_notice_5">최초 계약 시 \'보증금+3개월 의무사용 기간 이용료\'에서 사전예약금 50,000원을 차감하여 결제됩니다.</string>
                <string name="preorder_result_notice_6">약정기간 만료 후 매월 이용료가 자동 결제됩니다.</string>
                <string name="preorder_result_notice_7">픽업서비스는 계약 후 신청이 가능합니다.</string>
                <string name="preorder_result_notice_8">유효기간 만료 후 계약 및 사전예약금 50,000원 환불이 불가합니다.</string>
                <string name="preorder_result_notice_9">지점 오픈일 이후 사전예약 취소 및 환불이 불가합니다.</string>
                <string name="preorder_result_notice_10">예약금 결제 후 사이즈 변경 및 사전예약 취소는 다락 카카오 채널로 문의 부탁드립니다.</string>


                <!--  parent_payment_item xml  -->
                <string name="parent_payment_item_payment_title">결제금액</string>
                <string name="parent_payment_item_payment_currency_won">원</string>


                <!--  payment_info_area xml  -->
                <string name="payment_info_area_monthly_fee">월 이용 요금</string>
                <string name="payment_info_area_promotion_discount">프로모션 할인&#160;</string>
                <string name="payment_info_area_currency_won">원</string>


                <!--  Pickup Container Fragment  -->
                <string name="pickup_container_pickup_using_guide">픽업 이용안내</string>
                <string name="pickup_fragment_prev_btn">이전</string>
                <string name="pickup_fragment_next_btn">다음</string>
                <string name="pickup_fragment_goto_detail">상세보기</string>

                <!--  Pickup Tab Register Fragment  -->
                <string name="pickup_tab_register_no_using_unit_notice">이용중인 유닛이 있는 경우에만\n픽업서비스 신청이 가능합니다.</string>
                <string name="pickup_tab_register_goto_branch_search">다락 지점 알아보러 가기</string>
                <string name="pickup_tab_register_banner_1">운반하기 어려운 짐이 있다면?</string>
                <string name="pickup_tab_register_banner_2">픽업서비스 신청하기</string>
                <string name="pickup_register">신청하기</string>
                <string name="pickup_register_error">* 먼저 신청한 픽업서비스가 예약 확정되어야 추가 신청하실 수 있습니다.</string>

                <!--  End Use Branch Tab Fragment  -->
                <string name="end_use_branch_tab_fragment_banner_1">운반하기 어려운 짐이 있다면?</string>
                <string name="end_use_branch_tab_fragment_banner_2">픽업서비스 신청하기</string>

                <!--  Pickup HopeDay Fragment  -->
                <string name="pickup_hopeday_fragment_header">픽업서비스 신청</string>
                <string name="pickup_hopeday_fragment_title">희망일자</string>
                <string name="pickup_hopeday_fragment_hopeday">희망일</string>
                <string name="pickup_hopeday_fragment_select_component">선택해주세요</string>
                <string name="pickup_hopeday_fragment_visit_time">희망 시간</string>
                <string name="pickup_hopeday_fragment_introductory_remark_1">선택</string>
                <string name="pickup_hopeday_fragment_introductory_remark_2">불가</string>

                <!--  Pickup Luggage Size Fragment  -->
                <string name="pickup_luggage_size_fragment_luggage_size">짐 크기</string>
                <string name="pickup_luggage_size_fragment_pickup_box_number">픽업할 박스 수량</string>
                <string name="pickup_luggage_size_fragment_box">&#160;박스</string>
                <string name="pickup_luggage_size_fragment_box_size">*기준 : 우체국 5호 박스 (48*38*34cm,  최대 12.9kg)</string>
                <string name="pickup_luggage_size_fragment_store_size">보관 공간</string>
                <string name="pickup_luggage_size_fragment_small_size_recommend">의류 100-150벌 수납</string>
                <string name="pickup_luggage_size_fragment_store_notice">&#160;보관 가능</string>
                <string name="pickup_luggage_size_fragment_notice_1">포장된 물품만 픽업 가능하며 물품이 미포장된 경우 픽업이 거부되거나 현장에서  별도 포장비 결제가 필요할 수 있습니다.</string>
                <string name="pickup_luggage_size_fragment_else_luggage">이외 짐</string>
                <string name="pickup_luggage_size_fragment_load_memo_hint">예) 골프백 1개, 의자 2개, 거울 1개</string>

                <!--  Pickup Pay Success Fragment  -->
                <string name="pickup_pay_success_fragment_title_1">결제가 완료</string>
                <string name="pickup_pay_success_fragment_title_2">되었습니다.</string>
                <string name="pickup_pay_success_fragment_goto_pickup_using_history">픽업 이용내역 보러가기</string>
                <!--  Pickup Pay Fail Fragment  -->
                <string name="pickup_pay_fail_fragment_title_1">결제가 실패</string>
                <string name="pickup_pay_fail_fragment_title_2">되었습니다.</string>
                <string name="pickup_pay_fail_fragment_user_cancel">사용자가 결제를 취소하였습니다.\n이용내역에서 <b>예약 취소</b>를 진행해주세요</string>
                <string name="pickup_pay_fail_fragment_confirm_btn">확인</string>

                <!--  Pickup Regi Addr Fragment  -->
                <string name="pickup_regi_addr_title">주소</string>
                <string name="pickup_regi_addr_change_default">기본 주소로 변경하기</string>
                <string name="pickup_regi_addr_input_addr">주소를 입력해주세요</string>
                <string name="pickup_regi_addr_input_addr_detail">상세주소를 입력해주세요</string>
                <string name="pickup_regi_addr_no">아니오</string>
                <string name="pickup_regi_addr_yes">네</string>

                <!--  Pickup Req Payment Fragment  -->
                <string name="pickup_req_payment_bar">|</string>
                <string name="pickup_req_payment_title">신청내역</string>
                <string name="pickup_req_payment_hope_day">희망일</string>
                <string name="pickup_req_payment_visit_day">방문일</string>
                <string name="pickup_req_payment_start">출발 장소</string>
                <string name="pickup_req_payment_destination">도착 장소</string>
                <string name="pickup_req_payment_luggage_size">짐 크기</string>
                <string name="pickup_req_payment_load_memo">박스 외 물품</string>
                <string name="pickup_req_payment_floor">층수</string>
                <string name="pickup_req_payment_elevator">엘리베이터</string>
                <string name="pickup_req_payment_notice_1">일정 확인 후 예약이 확정되면 등록된 연락처로 안내 메시지가 발송됩니다. (영업일 기준 1일 내)</string>
                <string name="pickup_req_payment_notice_2">픽업서비스 안내 사항과 취소 환불 규정을 확인하고 동의합니다.</string>
                <string name="pickup_req_payment_notice_3">안내 사항</string>
                <string name="pickup_req_payment_notice_4">• 픽업서비스는 서울과 경기도 일부 지역만 이용가능합니다.</string>
                <string name="pickup_req_payment_notice_5">• 픽업서비스의 특성상 계약된 지점 유닛의 도어락을 운송 기사가 오픈할 수 있게 정보를 제공해야 합니다.</string>
                <string name="pickup_req_payment_notice_6">• 기본 거리(10km)초과 시 10km당 10,000원이 추가됩니다.</string>
                <string name="pickup_req_payment_notice_7">• 물품 부피 등으로 인한 인원 추가, 가구분해조립, 계단 작업, 사다리차, 포장 등 발생 시 요금이 추가될 수 있습니다.</string>
                <string name="pickup_req_payment_notice_8">• 자세한 내용은 고객센터(1661-0180)으로 문의 바랍니다.</string>
                <string name="pickup_req_payment_notice_9">취소/환불 규정</string>
                <string name="pickup_req_payment_notice_10">• 방문일 D-1일 오후 6시 이전 취소, 100% 환불</string>
                <string name="pickup_req_payment_notice_11">• 방문일 D-1일 오후 6시 이후 취소, 환불 불가</string>

                <!--  Pickup Using History Fragment  -->
                <string name="pickup_using_history_header_title">픽업 이용내역</string>
                <string name="pickup_using_history_request_day">신청일</string>
                <string name="pickup_using_history_notice_1">일정 확인 후 예약이 확정되면 등록된 연락처로 안내 메시지가 발송됩니다. (영업일 기준 1일 내)</string>
                <string name="pickup_using_history_notice_2">취소/환불 규정</string>
                <string name="pickup_using_history_notice_3">• 2022년 12월 24일 오후 6시 이전 취소, 100% 환불</string>
                <string name="pickup_using_history_notice_4">• 2022년 12월 24일 오후 6시 이후 취소, 환불 불가</string>
                <string name="pickup_using_history_reserve_cancel">예약취소</string>

                <!--  Pickup Using Guide DialogFragment  -->
                <string name="pickup_using_guide_dialog_title">픽업 이용안내</string>
                <string name="pickup_using_guide_dialog_intro">픽업 서비스는 다락을 이용중인 고객님의 짐을 \n다락의 창고로 보내거나 찾을 수 있는 서비스입니다.</string>
                <string name="pickup_using_guide_dialog_notice_1">*현재는&#160;</string>
                <string name="pickup_using_guide_dialog_notice_2">서울, 경기 일부 지역</string>
                <string name="pickup_using_guide_dialog_notice_3">만 신청 가능합니다.</string>
                <string name="pickup_using_guide_dialog_notice_4">*이용중인 지점에서 10km이내 거리까지 기본 요금입니다.\n*별도 문의가 필요하신 경우 고객센터로 연락주세요.</string>


                <string name="pickup_reserve_cancel_popup_title">예약취소</string>
                <string name="pickup_reserve_cancel_popup_content">예약 취소 시 동일한 일정으로\n 재예약이 불가능할 수 있으니\n 이용에 참고 부탁드립니다.</string>
                <string name="pickup_reserve_cancel_popup_confirm">예약이 취소되었습니다</string>

                <!--  Pickup Service Fragment  -->
                <string name="pickup_title">픽업 서비스</string>
                <string name="pickup_register_tab_title">신청하기</string>
                <string name="pickup_used_history_tab_title">이용내역</string>

                <!--  host apdu service  -->
                <string name="aid_group_other">AID_GROUP_OTHER</string>

                <!--  Pay Fail Fragment  -->
                <string name="pay_fail_user_cancel_msg">사용자가 결제를 취소하였습니다.</string>
                <string name="pay_fail_server_fail_msg">고객님 죄송합니다.\n결제 완료를 정상적으로 확인하지 못하였습니다.\n이미 결제가 되었을 수도 있으니, 카드사 내역을 확인하시거나 다락 고객센터로 문의주세요.</string>
                <string name="pay_fail_kakao_faq">카카오 문의하기</string>
                <string name="pay_fail_confirm_btn">확인</string>

                <!--  Branch Using Info Container Fragment  -->
                <string name="branch_using_info_container_using_tab">이용 / 예정</string>
                <string name="branch_using_info_container_used_end">이용 종료</string>

                <!--  Using Branch Tab Fragment  -->
                <string name="using_branch_tab_fragment_using_day">이용기간</string>
                <string name="using_branch_tab_fragment_not_paid_tag">미납중</string>
                <string name="using_branch_tab_fragment_complete_request_tag">종료신청</string>
                <string name="using_branch_tab_fragment_dalock_family_tag">다락패밀리</string>

                <!--  Branch Contract Detail Info Fragment  -->
                <string name="branch_contract_detail_info_viewpager_index">%1$'d / %2$'d</string>
                <string name="branch_contract_detail_info_notice">NOTICE</string>
                <string name="branch_contract_detail_info_goto_smartpass">출입하기</string>
                <string name="branch_contract_detail_info_not_paid_notice_1">미납중 상태로 출입이 원활하지 않을 수 있습니다.</string>
                <string name="branch_contract_detail_info_not_paid_notice_2">미납중 상태로 종료 신청이 불가합니다.</string>
                <string name="branch_contract_detail_info_pickup_notice">다락으로 짐을 보내거나 꺼낼 수 있어요!</string>
                <string name="branch_contract_detail_info_goto_pickup">픽업 서비스</string>
                <string name="branch_contract_detail_info_goto_unit_memo">내 보관메모</string>
                <string name="branch_contract_detail_info_goto_branch_using_guide">지점 이용가이드</string>
                <string name="branch_contract_detail_info_payment_info_title">결제정보</string>
                <string name="branch_contract_detail_info_guarantee_fee">납부 보증금</string>
                <string name="branch_contract_detail_info_pay_plan_date">결제 예정일</string>
                <string name="branch_contract_detail_info_pay_plan_fee">결제 예정 금액</string>
                <string name="branch_contract_detail_info_payment_method">결제 수단</string>
                <string name="branch_contract_detail_info_dalock_family">다락패밀리</string>
                <string name="branch_contract_detail_info_dalock_family_manage">다락패밀리 관리</string>
                <string name="branch_contract_detail_info_using_end">이용 종료</string>
                <string name="branch_contract_detail_info_using_end_request_notice">종료신청은 유닛을 비우고 촬영해주셔야 합니다.\n사진첩을 통한 등록은 불가하니 지점을 방문하여 진행해주세요.</string>
                <string name="branch_contract_detail_info_using_end_request">종료 신청 하기</string>
                <string name="branch_contract_detail_info_using_end_notice_2">정기결제일 전일까지 종료를 신청하셔야</string>
                <string name="branch_contract_detail_info_using_end_notice_3">다음 정기결제가 이루어지지 않습니다.</string>
                <string name="branch_contract_detail_info_contact_us_title">도움이 필요하세요?</string>
                <string name="branch_contract_detail_info_goto_kakao">카카오톡으로 문의하기</string>
                <string name="branch_contract_detail_info_goto_phone_call">전화로 문의하기</string>
                <string name="branch_contract_detail_info_camera_permission">카메라 접근 권한 승인</string>
                <string name="branch_contract_detail_info_camera_permission_is_not_granted">권한 승인이 거부 되었습니다</string>
                <string name="branch_contract_detail_info_camera_permissions_is_not_granted_message">설정 - 애플리케이션 - 앱 선택 - 권한에서 허용해주세요</string>

                <!--  Bottom Sheet Using End Fragment  -->
                <string name="bottom_sheet_using_end_fragment_title">종료 신청 하기</string>
                <string name="bottom_sheet_using_end_fragment_step_1">지점 방문/\n유닛 비우기</string>
                <string name="bottom_sheet_using_end_fragment_step_2">빈 유닛\n촬영 제출</string>
                <string name="bottom_sheet_using_end_fragment_step_3">종료 신청</string>
                <string name="bottom_sheet_using_end_fragment_step_4">관리자 확인/\n보증금 환불</string>
                <string name="bottom_sheet_using_end_fragment_step_5">종료신청 절차를 거치지 않는 경우 서비스 이용 종료로 인정되지 않으며, 이용요금이 계속 청구될 수 있습니다.</string>
                <string name="bottom_sheet_using_end_fragment_take_picture_title">사진촬영</string>
                <string name="bottom_sheet_using_end_fragment_take_picture_notice_1">(최대 5개)</string>
                <string name="bottom_sheet_using_end_fragment_take_picture_notice_2">유닛 번호와 빈 유닛을 확인 할 수 있는 사진을 찍어주세요.</string>
                <string name="bottom_sheet_using_end_fragment_take_picture">촬영하기</string>
                <string name="bottom_sheet_using_end_fragment_notcie_title">유의사항</string>
                <string name="bottom_sheet_using_end_fragment_notice_1">관리자가 유닛의 이상없음을 확인한 후에 보증금을 환불해드립니다.</string>
                <string name="bottom_sheet_using_end_fragment_notcie_2">종료 신청 시 확인되는 추가 비용(폐기 처분, 유닛 복구 비용 등)과 미결제분(미납금, 연체료, 운송료 등)을 정산 및 공제/결제한 후 보증금이 환불되며, 서비스 이용이 종료됩니다.</string>
                <string name="bottom_sheet_using_end_fragment_notice_3">서비스 해지 절차가 완료되면 이후 결제일부터 자동 결제가 종료됩니다.</string>
                <string name="bottom_sheet_using_end_fragment_notcie_4">종료 신청이 정기 결제일을 포함하여 15일 이내에 이루어질 경우, 해당 월 결제분의 50%가 환불됩니다. (계약 당월 제외)</string>
                <string name="bottom_sheet_using_end_fragment_notcie_5">이 외에 기재되지 않은 사항에 대해서는 내부 약관에 의거하여 처리됩니다.</string>
                <string name="bottom_sheet_using_end_fragment_notcie_6">유의사항을 확인하지 않아 생긴 불이익에 대해서는 당사 책임이 없습니다.</string>
                <string name="bottom_sheet_using_end_fragment_precaution_agreement">유의사항 내용을 확인하였으며, 위 내용에 동의합니다.</string>
                <string name="bottom_sheet_using_end_fragment_end_request">종료 신청</string>


                <!--  Bottom Sheet Using End Fragment - Complete UI -->
                <string name="bottom_sheet_using_end_fragment_complete_title">종료 신청 완료</string>
                <string name="bottom_sheet_using_end_fragment_complete_explain_1">종료처리는 신청일 다음날까지 처리 예정입니다.</string>
                <string name="bottom_sheet_using_end_fragment_complete_branch_name">지점명</string>
                <string name="bottom_sheet_using_end_fragment_complete_unit">유닛</string>
                <string name="bottom_sheet_using_end_fragment_complete_using_date">이용일</string>
                <string name="bottom_sheet_using_end_fragment_complete_end_request_date">종료 신청일</string>
                <string name="bottom_sheet_using_end_fragment_complete_refund_deposit_title">보증금 환불 안내</string>
                <string name="bottom_sheet_using_end_fragment_complete_refund_notice_1">•  보증금 환불은 영업일 기준 3~5일 이내 카드 취소 됩니다.</string>
                <string name="bottom_sheet_using_end_fragment_complete_refund_notice_2">•  보증금 결제가 1년 이상일 경우 다락 카카오톡 채널로 계약자 본인 명의의 계좌번호를 전달 부탁드립니다.</string>
                <string name="bottom_sheet_using_end_fragment_complete_refund_notice_3">•  신청 내용이 실제 내용과 다를 경우 다락에서 연락을 드릴 수 있습니다.</string>


                <!--  Dalock Family Fragment  -->
                <string name="dalock_family_title">다락패밀리</string>
                <string name="dalock_family_notice">다락패밀리는 최대 3명까지 초대 가능합니다.</string>
                <string name="dalock_family_add_new_family_btn">새로운 멤버 추가하기</string>
                <string name="dalock_family_add_new_family_title">다락패밀리 추가하기</string>
                <string name="dalock_family_count_info">대표를 포함한 <![CDATA[<b>%1$'d명</b>]]>이 함께 이용중입니다.</string>
                <string name="dalock_family_precaution_title">유의사항</string>
                <string name="dalock_family_precaution_content_1">다락패밀리 이용 시 대표자에게 이용의 책임과 권한이 부여됩니다. (회사는 회원 간 분쟁에 대하여 개입하지 않습니다.)</string>
                <string name="dalock_family_precaution_content_2">다락 계약 종료시 패밀리 대표와 멤버 모두 이용이 제한됩니다.</string>
                <string name="dalock_family_bottom_sheet_input_phone_number">핸드폰 번호 검색</string>
                <string name="dalock_family_bottom_sheet_phone_num_notice">핸드폰 번호는 다락패밀리 추가에만 활용되며, 고객 정보는 마스킹 처리되어 일부만 제공됩니다.</string>
                <string name="dalock_family_bottom_sheet_not_matched_user">대상이 없습니다.\n확인후 다시 검색해주세요.</string>
                <string name="dalock_family_bottom_sheet_self_search_result">본인은 추가할 수 없습니다.\n확인후 다시 검색해주세요.</string>
                <string name="dalock_family_using_state_1">%1$'d명</string>
                <string name="dalock_family_using_state_2">의 멤버가 함께 이용중입니다.</string>
                <string name="dalock_family_bottom_sheet_dialog_explain_text_1">다락패밀리로\n친구나 가족과 함께 이용해요.</string>
                <string name="dalock_family_bottom_sheet_dialog_explain_text_2">최대 4인까지 사용 가능</string>
                <string name="dalock_family_bottom_sheet_dialog_explain_text_3">미니창고 다락을\n합리적이고 알뜰하게 이용해요.</string>
                <string name="dalock_family_bottom_sheet_dialog_explain_text_4">함께 이용하고 비용은 1/n</string>
                <string name="dalock_family_bottom_sheet_dialog_explain_text_5">다락 앱으로\n다락패밀리 멤버를 편하게 관리해요.</string>
                <string name="dalock_family_bottom_sheet_dialog_explain_text_6">다락패밀리 대표자에 한함</string>
                <string name="dalock_family_present_tag">대표</string>
                <string name="dalock_family_member_release">내보내기</string>
                <string name="dalock_family_member_add">추가하기</string>


                <!--  App Popup Dialog Fragment  -->
                <string name="app_popup_dialog_title_1">이용료 미납중</string>
                <string name="app_popup_dialog_content_1">고객센터를 통해 납부 후\n종료신청 해주세요.</string>
                <string name="app_popup_dialog_content_2">서비스 내에서 종료 신청이 불가한 고객입니다.\n고객센터를 통해 종료신청 해주세요.</string>
                <string name="app_popup_dialog_content_3">신청 완료에 실패하였습니다.\n다시 시도해주세요.</string>
                <string name="app_popup_dialog_content_4">이미 종료 신청된 계약입니다.\n관리자 확인 후 종료처리 됩니다.</string>료

                <!--  Dalock Family Add Release Dialog Fragment  -->
                <string name="dialog_dalock_family_add_title">다락패밀리에 추가하시겠습니까?</string>
                <string name="dialog_dalock_family_add_content">지점 및 유닛을 공동으로 사용합니다.</string>
                <string name="dialog_dalock_family_already_added">이미 추가된 멤버입니다.</string>
                <string name="dialog_dalock_family_release_title">다락패밀리에서 내보내시겠습니까?</string>
                <string name="dialog_dalock_family_release_content">지점 출입 및 유닛 이용이 제한됩니다.</string>


                <!--  Payment Method Change  -->
                <string name="payment_method_title">결제 수단</string>
                <string name="payment_method_card_change">카드 변경</string>
                <string name="payment_method_masking_text">****</string>
                <string name="payment_method_change_title">결제 수단 변경</string>
                <string name="payment_method_change_card_property">카드 유형</string>
                <string name="payment_method_change_personal_card">개인 카드</string>
                <string name="payment_method_change_business_card">법인 카드</string>
                <string name="payment_method_change_card_number_title">카드 번호</string>
                <string name="payment_method_change_card_number_hint">0000</string>
                <string name="payment_method_change_card_number_error">카드 번호를 형식에 맞게 입력해주세요.</string>
                <string name="payment_method_change_card_validate_title">카드 유효 기간</string>
                <string name="payment_method_change_card_validate_hint">MM/YY</string>
                <string name="payment_method_change_card_validate_error">카드 유효 기간을 MM/YY에 맞게 입력해주세요.</string>
                <string name="payment_method_change_birthday_title">생년월일</string>
                <string name="payment_method_change_birthday_hint">YYYY-MM-DD</string>
                <string name="payment_method_change_birthday_error">생년월일을 YYYY-MM-DD에 맞게 입력해주세요.</string>
                <string name="payment_method_change_business_number_title">사업자 번호</string>
                <string name="payment_method_change_business_number_hint">사업자 번호를 입력해주세요.</string>
                <string name="payment_method_change_business_number_error">사업자 번호를 형식에 맞게 입력해주세요.</string>
                <string name="payment_method_change_card_pw_title">카드 비밀번호</string>
                <string name="payment_method_change_card_pw_hint">비밀번호 앞 2자리</string>
                <string name="payment_method_change_card_pw_error">카드 비밀번호를 형식에 맞게 입력해주세요</string>
                <string name="payment_method_change_precaution_title">유의사항</string>
                <string name="payment_method_change_precaution_agreement">유의사항을 확인하고 동의합니다.</string>
                <string name="payment_method_change_cancel">취소</string>
                <string name="payment_method_change_proceed_card_change">카드 변경</string>


                <!--  Payment History Fragment -->
                <string name="payment_history_dalock_tab">미니창고 다락</string>
                <string name="payment_history_pickup_tab">픽업서비스</string>
                <string name="payment_history_empty_payment_history">결제 내역이 없습니다.\n미니창고 다락 서비스를 이용해보세요.</string>
                <string name="payment_history_preorder_tag">사전예약결제</string>
                <string name="payment_history_pickup_payment_fee">결제금액</string>
                <string name="payment_history_pickup_refund_fee">환불금액</string>

        """.trimIndent()
    }
}