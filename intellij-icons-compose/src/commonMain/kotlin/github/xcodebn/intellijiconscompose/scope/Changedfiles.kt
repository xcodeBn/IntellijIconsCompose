package github.xcodebn.intellijiconscompose.scope

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Changedfiles: ImageVector
    get() {
        if (_Changedfiles != null) return _Changedfiles!!

        _Changedfiles = ImageVector.Builder(
            name = "Changedfiles",
            defaultWidth = 16.0.dp,
            defaultHeight = 16.0.dp,
            viewportWidth = 16.0f,
            viewportHeight = 16.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(0f, 0f)
                lineTo(14f, 0f)
                lineTo(14f, 14f)
                lineTo(0f, 14f)
                lineTo(0f, 0f)
                close()
                moveTo(2f, 2f)
                lineTo(2f, 12f)
                lineTo(12f, 12f)
                lineTo(12f, 2f)
                lineTo(2f, 2f)
                close()
            }
            group() {
                path(
                    fill = SolidColor(Color(0xFF000000))
                ) {
                    moveTo(0f, 0f)
                    lineTo(14f, 0f)
                    lineTo(14f, 14f)
                    lineTo(0f, 14f)
                    lineTo(0f, 0f)
                    close()
                    moveTo(2f, 2f)
                    lineTo(2f, 12f)
                    lineTo(12f, 12f)
                    lineTo(12f, 2f)
                    lineTo(2f, 2f)
                    close()
                }
            }
        }.build()

        return _Changedfiles!!
    }

private var _Changedfiles: ImageVector? = null

