package github.xcodebn.intellijiconscompose.ide

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val StatusbarArrowsDark: ImageVector
    get() {
        if (_StatusbarArrowsDark != null) return _StatusbarArrowsDark!!

        _StatusbarArrowsDark = ImageVector.Builder(
            name = "StatusbarArrowsDark",
            defaultWidth = 7.0.dp,
            defaultHeight = 10.0.dp,
            viewportWidth = 7.0f,
            viewportHeight = 10.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFFAFB1B3))
            ) {
                moveTo(4f, 1f)
                lineTo(6f, 4f)
                lineTo(1f, 4f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFAFB1B3))
            ) {
                moveTo(4f, 6f)
                lineTo(6f, 9f)
                lineTo(1f, 9f)
                close()
            }
        }.build()

        return _StatusbarArrowsDark!!
    }

private var _StatusbarArrowsDark: ImageVector? = null

