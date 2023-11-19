using System.Collections;
using System.Collections.Generic;
using UnityEngine;
using UnityEngine.UI;
using TMPro;

public class air_gauge_director : MonoBehaviour
{
    public TextMeshProUGUI airnumber;
    public TextMeshProUGUI airtext;
    GameObject airgauge;
    // Start is called before the first frame update
    void Start()
    {
        this.airgauge = GameObject.Find("air_gauge");
        int number = Random.Range(0, 101);
        airnumber.text = number.ToString();
        if (number < 20)
        {
            this.airgauge.GetComponent<Image>().fillAmount -= 0.11f;
            airtext.text = "좋음";

        }
        else if (number < 36)
        {
            this.airgauge.GetComponent<Image>().fillAmount -= 0.33f;
            airtext.text = "보통";
        }
        else if (number < 76)
        {
            this.airgauge.GetComponent<Image>().fillAmount -= 0.66f;
            airtext.text = "주의";
        }
        else if (number >= 76)
        {
            this.airgauge.GetComponent<Image>().fillAmount -= 0.99f;
            airtext.text = "나쁨";
        }
    }

    // Update is called once per frame
    void Update()
    {
        
    }
    public void DecreaseAir()
    {
        

    }
    public void plusAir()
    {
        this.airgauge.GetComponent<Image>().fillAmount += 0.1f;
    }
}
