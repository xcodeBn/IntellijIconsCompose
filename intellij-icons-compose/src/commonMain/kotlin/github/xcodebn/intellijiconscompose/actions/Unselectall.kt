package github.xcodebn.intellijiconscompose.actions

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Unselectall: ImageVector
    get() {
        if (_Unselectall != null) return _Unselectall!!

        _Unselectall = ImageVector.Builder(
            name = "Unselectall",
            defaultWidth = 16.0.dp,
            defaultHeight = 16.0.dp,
            viewportWidth = 16.0f,
            viewportHeight = 16.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF6E6E6E))
            ) {
                moveTo(2f, 2f)
                lineTo(14f, 2f)
                lineTo(14f, 14f)
                lineTo(2f, 14f)
                lineTo(2f, 2f)
                close()
                moveTo(4f, 4f)
                lineTo(4f, 12f)
                lineTo(12f, 12f)
                lineTo(12f, 4f)
                lineTo(4f, 4f)
                close()
            }
            group() {
                path(
                    fill = SolidColor(Color(0xFF6E6E6E))
                ) {
                    moveTo(2f, 2f)
                    lineTo(14f, 2f)
                    lineTo(14f, 14f)
                    lineTo(2f, 14f)
                    lineTo(2f, 2f)
                    close()
                    moveTo(4f, 4f)
                    lineTo(4f, 12f)
                    lineTo(12f, 12f)
                    lineTo(12f, 4f)
                    lineTo(4f, 4f)
                    close()
                }
            }
        }.build()

        return _Unselectall!!
    }

private var _Unselectall: ImageVector? = null

