using System.Collections;
using System.Collections.Generic;
using UnityEngine;
using UnityEngine.UI;
using TMPro;

public class time_button : MonoBehaviour
{
    public TextMeshProUGUI timetext;
    public int number = 0;
    // Start is called before the first frame update
    void Start()
    {
        Button upButton = GameObject.Find("UP_Button").GetComponent<Button>();
        Button downButton = GameObject.Find("DOWN_Button").GetComponent<Button>();
        if (upButton != null && downButton != null)
        {
            upButton.onClick.AddListener(OnUpButtonClick);
            downButton.onClick.AddListener(OnDownButtonClick);
        }
        else Debug.Log("오류");
    }

    // Update is called once per frame
    void Update()
    {

    }
    void OnUpButtonClick()
    {
        number = int.Parse(timetext.text) + 1;
        timetext.text = number.ToString();
        //GameObject director = GameObject.Find("air_gauge_director");
        //director.GetComponent<air_gauge_director>().DecreaseAir();
    }

    // DOWN 버튼 클릭 시 호출되는 메서드
    void OnDownButtonClick()
    {
        // number가 0보다 큰 경우에만 감소하도록 함
        if (number > 0)
        {
            number = int.Parse(timetext.text) - 1;
            timetext.text = number.ToString();
            //GameObject director = GameObject.Find("air_gauge_director");
            //director.GetComponent<air_gauge_director>().plusAir();
        }
    }
}
