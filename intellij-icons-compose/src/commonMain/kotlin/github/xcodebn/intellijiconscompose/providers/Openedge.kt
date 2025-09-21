package github.xcodebn.intellijiconscompose.providers

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Openedge: ImageVector
    get() {
        if (_Openedge != null) return _Openedge!!

        _Openedge = ImageVector.Builder(
            name = "Openedge",
            defaultWidth = 16.0.dp,
            defaultHeight = 16.0.dp,
            viewportWidth = 16.0f,
            viewportHeight = 16.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF5CE400))
            ) {
                moveTo(5f, 14f)
                verticalLineTo(10f)
                lineTo(2f, 12f)
                lineTo(5f, 14f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF5CE400))
            ) {
                moveTo(6f, 10f)
                verticalLineTo(15f)
                lineTo(9f, 13f)
                verticalLineTo(8f)
                lineTo(5f, 5f)
                lineTo(2f, 7f)
                lineTo(6f, 10f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF5CE400))
            ) {
                moveTo(8f, 1f)
                lineTo(4f, 3f)
                lineTo(11f, 7f)
                verticalLineTo(14f)
                lineTo(14f, 12f)
                verticalLineTo(5f)
                lineTo(8f, 1f)
                close()
            }
        }.build()

        return _Openedge!!
    }

private var _Openedge: ImageVector? = null

