package github.xcodebn.intellijiconscompose.runconfigurations

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val HidepassedDark: ImageVector
    get() {
        if (_HidepassedDark != null) return _HidepassedDark!!

        _HidepassedDark = ImageVector.Builder(
            name = "HidepassedDark",
            defaultWidth = 16.0.dp,
            defaultHeight = 16.0.dp,
            viewportWidth = 16.0f,
            viewportHeight = 16.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFFAFB1B3))
            ) {
                moveTo(9f, 8f)
                lineTo(9f, 12f)
                lineTo(7f, 12f)
                lineTo(7f, 8f)
                lineTo(3f, 5f)
                lineTo(3f, 4f)
                lineTo(13f, 4f)
                lineTo(13f, 5f)
                lineTo(9f, 8f)
                close()
            }
            group() {
                path(
                    fill = SolidColor(Color(0xFFAFB1B3))
                ) {
                    moveTo(9f, 8f)
                    lineTo(9f, 12f)
                    lineTo(7f, 12f)
                    lineTo(7f, 8f)
                    lineTo(3f, 5f)
                    lineTo(3f, 4f)
                    lineTo(13f, 4f)
                    lineTo(13f, 5f)
                    lineTo(9f, 8f)
                    close()
                }
            }
        }.build()

        return _HidepassedDark!!
    }

private var _HidepassedDark: ImageVector? = null

