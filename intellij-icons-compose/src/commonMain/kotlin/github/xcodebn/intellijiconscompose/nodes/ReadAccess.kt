package github.xcodebn.intellijiconscompose.nodes

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val ReadAccess: ImageVector
    get() {
        if (_ReadAccess != null) return _ReadAccess!!

        _ReadAccess = ImageVector.Builder(
            name = "ReadAccess",
            defaultWidth = 16.0.dp,
            defaultHeight = 16.0.dp,
            viewportWidth = 16.0f,
            viewportHeight = 16.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF62B543))
            ) {
                moveTo(10f, 3f)
                lineTo(7f, 6f)
                lineTo(8f, 6f)
                lineTo(10f, 4f)
                lineTo(14f, 7f)
                lineTo(11f, 11f)
                lineTo(8f, 9f)
                lineTo(7f, 9f)
                lineTo(11f, 12f)
                lineTo(15f, 8f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF62B543))
            ) {
                moveTo(5f, 10f)
                lineTo(2f, 8f)
                lineTo(5f, 5f)
                lineTo(5f, 7f)
                lineTo(10f, 7f)
                lineTo(10f, 8f)
                lineTo(5f, 8f)
                close()
            }
        }.build()

        return _ReadAccess!!
    }

private var _ReadAccess: ImageVector? = null

