package github.xcodebn.intellijiconscompose.nodes

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Deploy: ImageVector
    get() {
        if (_Deploy != null) return _Deploy!!

        _Deploy = ImageVector.Builder(
            name = "Deploy",
            defaultWidth = 16.0.dp,
            defaultHeight = 16.0.dp,
            viewportWidth = 16.0f,
            viewportHeight = 16.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF62B543))
            ) {
                moveTo(11f, 7f)
                lineTo(1f, 7f)
                lineTo(1f, 9f)
                lineTo(11f, 9f)
                lineTo(11f, 12f)
                lineTo(15f, 8f)
                lineTo(11f, 4f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF62B543))
            ) {
                moveTo(5f, 1f)
                lineTo(7f, 3f)
                lineTo(5f, 5f)
                lineTo(6f, 6f)
                lineTo(8f, 4f)
                lineTo(10f, 6f)
                lineTo(10f, 1f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF62B543))
            ) {
                moveTo(5f, 11f)
                lineTo(7f, 13f)
                lineTo(5f, 15f)
                lineTo(10f, 15f)
                lineTo(10f, 10f)
                lineTo(8f, 12f)
                lineTo(6f, 10f)
                close()
            }
        }.build()

        return _Deploy!!
    }

private var _Deploy: ImageVector? = null

