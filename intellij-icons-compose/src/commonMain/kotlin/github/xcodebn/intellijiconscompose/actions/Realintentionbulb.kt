package github.xcodebn.intellijiconscompose.actions

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Realintentionbulb: ImageVector
    get() {
        if (_Realintentionbulb != null) return _Realintentionbulb!!

        _Realintentionbulb = ImageVector.Builder(
            name = "Realintentionbulb",
            defaultWidth = 16.0.dp,
            defaultHeight = 16.0.dp,
            viewportWidth = 16.0f,
            viewportHeight = 16.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(10f, 4f)
                lineTo(8f, 2f)
                close()
                moveTo(12f, 2f)
                curveTo(12.06f, 2.02f, 12.06f, 1.42f, 11.83f, 1.20f)
                close()
                moveTo(6f, 2f)
                lineTo(5f, 3f)
                close()
                moveTo(8f, 0f)
                lineTo(7f, 1f)
                close()
                moveTo(4f, 4f)
                lineTo(3f, 5f)
                close()
            }
            group() {
                path(
                    fill = SolidColor(Color(0xFF000000))
                ) {
                    moveTo(10f, 4f)
                    lineTo(8f, 2f)
                    close()
                    moveTo(12f, 2f)
                    curveTo(12.06f, 2.02f, 12.06f, 1.42f, 11.83f, 1.20f)
                    close()
                    moveTo(6f, 2f)
                    lineTo(5f, 3f)
                    close()
                    moveTo(8f, 0f)
                    lineTo(7f, 1f)
                    close()
                    moveTo(4f, 4f)
                    lineTo(3f, 5f)
                    close()
                }
            }
        }.build()

        return _Realintentionbulb!!
    }

private var _Realintentionbulb: ImageVector? = null

