package github.xcodebn.intellijiconscompose.general

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FitcontentDark: ImageVector
    get() {
        if (_FitcontentDark != null) return _FitcontentDark!!

        _FitcontentDark = ImageVector.Builder(
            name = "FitcontentDark",
            defaultWidth = 16.0.dp,
            defaultHeight = 16.0.dp,
            viewportWidth = 16.0f,
            viewportHeight = 16.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFFAFB1B3))
            ) {
                moveTo(1f, 2f)
                lineTo(15f, 2f)
                lineTo(15f, 14f)
                lineTo(1f, 14f)
                lineTo(1f, 2f)
                close()
                moveTo(2f, 4f)
                lineTo(2f, 12f)
                lineTo(14f, 12f)
                lineTo(14f, 4f)
                lineTo(2f, 4f)
                close()
            }
            group() {
                path(
                    fill = SolidColor(Color(0xFFAFB1B3))
                ) {
                    moveTo(1f, 2f)
                    lineTo(15f, 2f)
                    lineTo(15f, 14f)
                    lineTo(1f, 14f)
                    lineTo(1f, 2f)
                    close()
                    moveTo(2f, 4f)
                    lineTo(2f, 12f)
                    lineTo(14f, 12f)
                    lineTo(14f, 4f)
                    lineTo(2f, 4f)
                    close()
                }
            }
        }.build()

        return _FitcontentDark!!
    }

private var _FitcontentDark: ImageVector? = null

