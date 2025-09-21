package github.xcodebn.intellijiconscompose.nodes

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Artifact: ImageVector
    get() {
        if (_Artifact != null) return _Artifact!!

        _Artifact = ImageVector.Builder(
            name = "Artifact",
            defaultWidth = 16.0.dp,
            defaultHeight = 16.0.dp,
            viewportWidth = 16.0f,
            viewportHeight = 16.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF40B6E0))
            ) {
                moveTo(9f, 8f)
                lineTo(12f, 11f)
                lineTo(15f, 8f)
                lineTo(12f, 5f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF9AA7B0))
            ) {
                moveTo(5f, 4f)
                lineTo(8f, 7f)
                lineTo(11f, 4f)
                lineTo(8f, 1f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF40B6E0))
            ) {
                moveTo(1f, 8f)
                lineTo(4f, 11f)
                lineTo(7f, 8f)
                lineTo(4f, 5f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF9AA7B0))
            ) {
                moveTo(5f, 12f)
                lineTo(8f, 15f)
                lineTo(11f, 12f)
                lineTo(8f, 9f)
                close()
            }
        }.build()

        return _Artifact!!
    }

private var _Artifact: ImageVector? = null

