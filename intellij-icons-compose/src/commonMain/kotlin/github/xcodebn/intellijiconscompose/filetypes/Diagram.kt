package github.xcodebn.intellijiconscompose.filetypes

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Diagram: ImageVector
    get() {
        if (_Diagram != null) return _Diagram!!

        _Diagram = ImageVector.Builder(
            name = "Diagram",
            defaultWidth = 16.0.dp,
            defaultHeight = 16.0.dp,
            viewportWidth = 16.0f,
            viewportHeight = 16.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF9AA7B0))
            ) {
                moveTo(1f, 15f)
                lineTo(15f, 15f)
                lineTo(15f, 12f)
                lineTo(1f, 12f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF9AA7B0))
            ) {
                moveTo(1f, 4f)
                lineTo(15f, 4f)
                lineTo(15f, 1f)
                lineTo(1f, 1f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF40B6E0))
            ) {
                moveTo(4f, 4f)
                lineTo(2f, 7f)
                lineTo(4f, 7f)
                lineTo(4f, 12f)
                lineTo(5f, 12f)
                lineTo(5f, 7f)
                lineTo(7f, 7f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF40B6E0))
            ) {
                moveTo(12f, 4f)
                lineTo(9f, 7f)
                lineTo(11f, 7f)
                lineTo(11f, 8f)
                lineTo(12f, 8f)
                lineTo(12f, 7f)
                lineTo(14f, 7f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF40B6E0))
            ) {
                moveTo(11f, 10f)
                lineTo(12f, 10f)
                lineTo(12f, 9f)
                lineTo(11f, 9f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF40B6E0))
            ) {
                moveTo(11f, 12f)
                lineTo(12f, 12f)
                lineTo(12f, 11f)
                lineTo(11f, 11f)
                close()
            }
        }.build()

        return _Diagram!!
    }

private var _Diagram: ImageVector? = null

