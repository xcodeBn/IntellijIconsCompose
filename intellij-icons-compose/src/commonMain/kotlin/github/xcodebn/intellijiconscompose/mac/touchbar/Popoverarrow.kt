package github.xcodebn.intellijiconscompose.mac.touchbar

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Popoverarrow: ImageVector
    get() {
        if (_Popoverarrow != null) return _Popoverarrow!!

        _Popoverarrow = ImageVector.Builder(
            name = "Popoverarrow",
            defaultWidth = 16.0.dp,
            defaultHeight = 16.0.dp,
            viewportWidth = 16.0f,
            viewportHeight = 16.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFFAFB1B3))
            ) {
                moveTo(10f, 9f)
                curveTo(10.27f, 8.86f, 10.25f, 8.90f, 10.23f, 8.94f)
                lineTo(7f, 14f)
                curveTo(6.99f, 14.34f, 6.47f, 14.47f, 6.06f, 14.23f)
                curveTo(5.66f, 13.99f, 5.53f, 13.47f, 5.77f, 13.06f)
                lineTo(9f, 8f)
                curveTo(8.78f, 8.04f, 8.80f, 8.02f, 8.81f, 8.00f)
                curveTo(8.80f, 7.98f, 8.78f, 7.96f, 8.77f, 7.94f)
                lineTo(6f, 3f)
                curveTo(5.53f, 2.53f, 5.66f, 2.01f, 6.06f, 1.77f)
                curveTo(6.47f, 1.53f, 6.99f, 1.66f, 7.23f, 2.06f)
                lineTo(10f, 7f)
                curveTo(10.25f, 7.10f, 10.27f, 7.14f, 10.28f, 7.17f)
                lineTo(11f, 8f)
                lineTo(10f, 9f)
                close()
            }
        }.build()

        return _Popoverarrow!!
    }

private var _Popoverarrow: ImageVector? = null

