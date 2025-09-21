package github.xcodebn.intellijiconscompose.runconfigurations

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val ScrollDownDark: ImageVector
    get() {
        if (_ScrollDownDark != null) return _ScrollDownDark!!

        _ScrollDownDark = ImageVector.Builder(
            name = "ScrollDownDark",
            defaultWidth = 16.0.dp,
            defaultHeight = 16.0.dp,
            viewportWidth = 16.0f,
            viewportHeight = 16.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFFAFB1B3))
            ) {
                moveTo(12f, 6f)
                lineTo(15f, 6f)
                lineTo(11f, 10f)
                lineTo(7f, 6f)
                lineTo(10f, 6f)
                lineTo(10f, 1f)
                lineTo(12f, 1f)
                close()
            }
        }.build()

        return _ScrollDownDark!!
    }

private var _ScrollDownDark: ImageVector? = null

